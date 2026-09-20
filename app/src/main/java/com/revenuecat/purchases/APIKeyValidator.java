package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import defpackage.iv4;
import defpackage.mv4;

/* JADX INFO: loaded from: classes3.dex */
public final class APIKeyValidator {

    public enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        LEGACY,
        OTHER_PLATFORM
    }

    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        LEGACY,
        OTHER_PLATFORM
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            iArr[ValidationResult.LEGACY.ordinal()] = 3;
            iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            iArr[ValidationResult.VALID.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        if (iv4.x(str, "goog_", false)) {
            return APIKeyPlatform.GOOGLE;
        }
        if (iv4.x(str, "amzn_", false)) {
            return APIKeyPlatform.AMAZON;
        }
        return !mv4.z(str, '_') ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    public final ValidationResult validate(String str, Store store) {
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(str);
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        return apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM ? ValidationResult.OTHER_PLATFORM : ValidationResult.OTHER_PLATFORM;
    }

    public final void validateAndLog(String str, Store store) {
        int i = WhenMappings.$EnumSwitchMapping$0[validate(str, store).ordinal()];
        if (i == 1) {
            LogUtilsKt.errorLog$default(ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, null, 2, null);
            return;
        }
        if (i == 2) {
            LogUtilsKt.errorLog$default(ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, null, 2, null);
        } else if (i == 3) {
            LogUtilsKt.debugLog(ConfigureStrings.LEGACY_API_KEY);
        } else {
            if (i != 4) {
                return;
            }
            LogUtilsKt.errorLog$default(ConfigureStrings.INVALID_API_KEY, null, 2, null);
        }
    }
}
