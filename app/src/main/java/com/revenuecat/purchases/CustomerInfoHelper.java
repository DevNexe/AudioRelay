package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import defpackage.FgDh;
import defpackage.cx1;
import defpackage.h81;
import defpackage.j81;
import defpackage.kg0;
import defpackage.sd5;
import defpackage.ur1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfoHelper {
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onReceived(this.$cachedCustomerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements h81<sd5> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14021 extends cx1 implements h81<sd5> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14021(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14031 extends cx1 implements j81<CustomerInfo, sd5> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01041 extends cx1 implements h81<sd5> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01041(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$info);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14031(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
            CustomerInfoHelper.this.cacheCustomerInfo(customerInfo);
            CustomerInfoHelper.this.sendUpdatedCustomerInfoToDelegateIfChanged(customerInfo);
            CustomerInfoHelper.this.dispatch(new C01041(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14042 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14042(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            Log.e("Purchases", "Error fetching customer data: " + purchasesError.getMessage());
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
            CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, IdentityManager identityManager, Handler handler) {
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.identityManager = identityManager;
        this.handler = handler;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        if (updatedCustomerInfoListener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            CustomerInfo cachedCustomerInfo = this.deviceCache.getCachedCustomerInfo(this.identityManager.getCurrentAppUserID());
            if (cachedCustomerInfo != null) {
                sendUpdatedCustomerInfoToDelegateIfChanged(cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(h81<sd5> h81Var) {
        if (ur1.a(Thread.currentThread(), this.handler.getLooper().getThread())) {
            h81Var.invoke();
        } else {
            this.handler.post(new FgDh(h81Var, 1));
        }
    }

    private final void getCustomerInfoCacheOnly(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (receiveCustomerInfoCallback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = this.deviceCache.getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new AnonymousClass1(receiveCustomerInfoCallback, cachedCustomerInfo));
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new AnonymousClass2(receiveCustomerInfoCallback, purchasesError));
        }
    }

    public static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        CustomerInfo cachedCustomerInfo = this.deviceCache.getCachedCustomerInfo(str);
        if (cachedCustomerInfo == null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
            getCustomerInfoFetchOnly(str, z, receiveCustomerInfoCallback);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C14021(receiveCustomerInfoCallback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(str, z);
        }
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoFetchOnly(String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(str);
        this.backend.getCustomerInfo(str, z, new C14031(receiveCustomerInfoCallback), new C14042(str, receiveCustomerInfoCallback));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z)) {
            getCustomerInfoFetchOnly(str, z, receiveCustomerInfoCallback);
        } else {
            getCustomerInfoCachedOrFetched(str, z, receiveCustomerInfoCallback);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z)) {
            LogWrapperKt.log(LogIntent.DEBUG, z ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            getCustomerInfoFetchOnly$default(this, str, z, null, 4, null);
        }
    }

    public final synchronized void cacheCustomerInfo(CustomerInfo customerInfo) {
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void retrieveCustomerInfo(String str, CacheFetchPolicy cacheFetchPolicy, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        LogUtilsKt.debugLog(String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{cacheFetchPolicy}, 1)));
        int i = WhenMappings.$EnumSwitchMapping$0[cacheFetchPolicy.ordinal()];
        if (i == 1) {
            getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
            return;
        }
        if (i == 2) {
            getCustomerInfoFetchOnly(str, z, receiveCustomerInfoCallback);
        } else if (i == 3) {
            getCustomerInfoCachedOrFetched(str, z, receiveCustomerInfoCallback);
        } else {
            if (i != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(str, z, receiveCustomerInfoCallback);
        }
    }

    public final void sendUpdatedCustomerInfoToDelegateIfChanged(CustomerInfo customerInfo) {
        UpdatedCustomerInfoListener updatedCustomerInfoListener;
        CustomerInfo customerInfo2;
        synchronized (this) {
            updatedCustomerInfoListener = this.updatedCustomerInfoListener;
            customerInfo2 = this.lastSentCustomerInfo;
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener2 = updatedCustomerInfoListener;
        if (updatedCustomerInfoListener2 == null || ur1.a(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER);
        }
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
            sd5 sd5Var = sd5.a;
        }
        dispatch(new CustomerInfoHelper$sendUpdatedCustomerInfoToDelegateIfChanged$2$2(updatedCustomerInfoListener2, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
            sd5 sd5Var = sd5.a;
        }
        afterSetListener(updatedCustomerInfoListener);
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, IdentityManager identityManager, Handler handler, int i, kg0 kg0Var) {
        this(deviceCache, backend, identityManager, (i & 8) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
