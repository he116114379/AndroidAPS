package app.aaps.core.ui.compose

import app.aaps.core.interfaces.protection.ProtectionCheck.Protection

/**
 * Unified visual identity for UI elements.
 * Each value carries icon, label, description, and color — accessed via extension functions
 * in ElementTypeStyle.kt.
 *
 * @param searchable Whether this element appears in global search results
 * @param protection Protection level required for navigation
 */
enum class ElementType(
    val searchable: Boolean = false,
    val protection: Protection = Protection.NONE
) {
    // Treatment dialogs
    INSULIN(searchable = true, protection = Protection.BOLUS),
    CARBS(searchable = true, protection = Protection.BOLUS),
    BOLUS_WIZARD(searchable = true, protection = Protection.BOLUS),
    QUICK_WIZARD(protection = Protection.BOLUS),
    TREATMENT(searchable = true, protection = Protection.BOLUS),

    // CGM
    CGM_XDRIP(searchable = true),
    CGM_DEX,
    CALIBRATION(searchable = true),

    // Profile & Targets
    PROFILE_SWITCH,
    PROFILE_MANAGEMENT(searchable = true, protection = Protection.PREFERENCES),
    TEMP_TARGET(protection = Protection.BOLUS),
    TEMP_TARGET_MANAGEMENT(searchable = true, protection = Protection.PREFERENCES),
    QUICK_WIZARD_MANAGEMENT(searchable = true, protection = Protection.PREFERENCES),

    // Careportal
    BG_CHECK(searchable = true),
    NOTE(searchable = true),
    EXERCISE(searchable = true),
    QUESTION(searchable = true),
    ANNOUNCEMENT(searchable = true),

    // Device maintenance
    SENSOR_INSERT(searchable = true),
    BATTERY_CHANGE(searchable = true),
    CANNULA_CHANGE(protection = Protection.BOLUS),
    FILL(searchable = true, protection = Protection.BOLUS),
    SITE_ROTATION(searchable = true),

    // Basal
    TEMP_BASAL(searchable = true, protection = Protection.BOLUS),
    EXTENDED_BOLUS(searchable = true, protection = Protection.BOLUS),

    // System
    AUTOMATION,
    PUMP,
    SETTINGS(protection = Protection.PREFERENCES),
    QUICK_LAUNCH_CONFIG(searchable = true),

    // Navigation screens
    TREATMENTS(searchable = true),
    STATISTICS(searchable = true),
    TDD_CYCLE_PATTERN(searchable = true),
    PROFILE_HELPER(searchable = true),
    HISTORY_BROWSER(searchable = true),
    SETUP_WIZARD(searchable = true, protection = Protection.PREFERENCES),
    MAINTENANCE(searchable = true, protection = Protection.PREFERENCES),
    CONFIGURATION(searchable = true, protection = Protection.PREFERENCES),
    ABOUT(searchable = true),

    // Display indicators
    COB,
    SENSITIVITY,

    // Running mode / loop (used by UserEntry)
    RUNNING_MODE(searchable = true, protection = Protection.BOLUS),
    USER_ENTRY,
    LOOP,
    AAPS;

    companion object {

        /** All searchable elements — use this to auto-populate search results. */
        val searchableEntries: List<ElementType> by lazy {
            entries.filter { it.searchable }
        }
    }
}
