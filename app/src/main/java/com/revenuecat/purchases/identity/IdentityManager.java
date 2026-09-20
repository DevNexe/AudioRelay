package com.revenuecat.purchases.identity;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import defpackage.cx1;
import defpackage.h81;
import defpackage.iv4;
import defpackage.j81;
import defpackage.sd5;
import defpackage.ur1;
import defpackage.x81;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityManager {
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements h81<sd5> {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ x81<CustomerInfo, Boolean, sd5> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements x81<CustomerInfo, Boolean, sd5> {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ x81<CustomerInfo, Boolean, sd5> $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(IdentityManager identityManager, x81<? super CustomerInfo, ? super Boolean, sd5> x81Var, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = x81Var;
                this.$newAppUserID = str;
                this.$oldAppUserID = str2;
            }

            @Override // defpackage.x81
            public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo, Boolean bool) {
                invoke(customerInfo, bool.booleanValue());
                return sd5.a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z) {
                IdentityManager identityManager = this.this$0;
                String str = this.$newAppUserID;
                String str2 = this.$oldAppUserID;
                synchronized (identityManager) {
                    LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z)}, 2)));
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    sd5 sd5Var = sd5.a;
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, j81<? super PurchasesError, sd5> j81Var, x81<? super CustomerInfo, ? super Boolean, sd5> x81Var) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = j81Var;
            this.$onSuccess = x81Var;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str2, str), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
        final /* synthetic */ j81<PurchasesError, sd5> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(j81<? super PurchasesError, sd5> j81Var) {
            super(0);
            this.$completion = j81Var;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IdentityManager.this.reset();
            LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, Backend backend) {
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.backend = backend;
    }

    private final String generateRandomID() {
        String strV = iv4.v(UUID.randomUUID().toString().toLowerCase(Locale.ROOT), "-", "");
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        return "$RCAnonymousID:".concat(strV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void reset() {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.deviceCache.cacheAppUserID(generateRandomID());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0026 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:5:0x0005, B:12:0x0012, B:14:0x001b, B:25:0x003a, B:20:0x0026, B:22:0x002e, B:24:0x0036), top: B:30:0x0005 }] */
    public final synchronized void configure(String str) {
        boolean z;
        if (str != null) {
            try {
                if (iv4.s(str)) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        if (z) {
            LogWrapperKt.log(LogIntent.WARNING, IdentityStrings.EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS);
        }
        if (str == null) {
            str = this.deviceCache.getCachedAppUserID();
            if (str == null && (str = this.deviceCache.getLegacyCachedAppUserID()) == null) {
                str = generateRandomID();
            }
        } else {
            if (iv4.s(str)) {
                str = null;
            }
            if (str == null) {
                str = this.deviceCache.getCachedAppUserID();
                if (str == null) {
                    str = generateRandomID();
                }
            }
        }
        LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1)));
        this.deviceCache.cacheAppUserID(str);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str);
        this.deviceCache.cleanupOldAttributionData();
    }

    public final synchronized boolean currentUserIsAnonymous() {
        Pattern patternCompile;
        String cachedAppUserID;
        patternCompile = Pattern.compile("^\\$RCAnonymousID:([a-f0-9]{32})$");
        cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null) {
            cachedAppUserID = "";
        }
        return patternCompile.matcher(cachedAppUserID).matches() || ur1.a(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    public final void logIn(String str, x81<? super CustomerInfo, ? super Boolean, sd5> x81Var, j81<? super PurchasesError, sd5> j81Var) {
        if (!iv4.s(str)) {
            LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), str}, 2)));
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, new AnonymousClass2(getCurrentAppUserID(), str, j81Var, x81Var));
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            j81Var.invoke(purchasesError);
        }
    }

    public final synchronized void logOut(j81<? super PurchasesError, sd5> j81Var) {
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new AnonymousClass1(j81Var));
        } else {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            j81Var.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
        }
    }
}
