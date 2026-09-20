package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class LogUtilsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesErrorCode.values().length];
            iArr[PurchasesErrorCode.UnknownError.ordinal()] = 1;
            iArr[PurchasesErrorCode.NetworkError.ordinal()] = 2;
            iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            iArr[PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            iArr[PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            iArr[PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            iArr[PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            iArr[PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            iArr[PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            iArr[PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            iArr[PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            iArr[PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            iArr[PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 13;
            iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 14;
            iArr[PurchasesErrorCode.StoreProblemError.ordinal()] = 15;
            iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 16;
            iArr[PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 17;
            iArr[PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 18;
            iArr[PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 19;
            iArr[PurchasesErrorCode.InvalidReceiptError.ordinal()] = 20;
            iArr[PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 21;
            iArr[PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 22;
            iArr[PurchasesErrorCode.IneligibleError.ordinal()] = 23;
            iArr[PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 24;
            iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 25;
            iArr[PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 26;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void debugLog(String str) {
        if (Config.INSTANCE.getDebugLogsEnabled()) {
            LogWrapperKt.getCurrentLogHandler().d("[Purchases] - DEBUG", str);
        }
    }

    public static final void errorLog(String str, Throwable th) {
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", str, th);
    }

    public static /* synthetic */ void errorLog$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        errorLog(str, th);
    }

    public static final void infoLog(String str) {
        LogWrapperKt.getCurrentLogHandler().i("[Purchases] - INFO", str);
    }

    public static final void warnLog(String str) {
        LogWrapperKt.getCurrentLogHandler().w("[Purchases] - WARN", str);
    }

    public static final void errorLog(PurchasesError purchasesError) {
        switch (WhenMappings.$EnumSwitchMapping$0[purchasesError.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                LogWrapperKt.log(LogIntent.RC_ERROR, purchasesError.getMessage());
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.getMessage());
                break;
        }
    }
}
