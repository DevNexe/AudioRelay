package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackendErrorCode.values().length];
            iArr[BackendErrorCode.BackendStoreProblem.ordinal()] = 1;
            iArr[BackendErrorCode.BackendCannotTransferPurchase.ordinal()] = 2;
            iArr[BackendErrorCode.BackendInvalidReceiptToken.ordinal()] = 3;
            iArr[BackendErrorCode.BackendInvalidPlayStoreCredentials.ordinal()] = 4;
            iArr[BackendErrorCode.BackendInvalidAuthToken.ordinal()] = 5;
            iArr[BackendErrorCode.BackendInvalidAPIKey.ordinal()] = 6;
            iArr[BackendErrorCode.BackendInvalidPaymentModeOrIntroPriceNotProvided.ordinal()] = 7;
            iArr[BackendErrorCode.BackendProductIdForGoogleReceiptNotProvided.ordinal()] = 8;
            iArr[BackendErrorCode.BackendEmptyAppUserId.ordinal()] = 9;
            iArr[BackendErrorCode.BackendPlayStoreQuotaExceeded.ordinal()] = 10;
            iArr[BackendErrorCode.BackendPlayStoreInvalidPackageName.ordinal()] = 11;
            iArr[BackendErrorCode.BackendInvalidPlatform.ordinal()] = 12;
            iArr[BackendErrorCode.BackendPlayStoreGenericError.ordinal()] = 13;
            iArr[BackendErrorCode.BackendUserIneligibleForPromoOffer.ordinal()] = 14;
            iArr[BackendErrorCode.BackendInvalidSubscriberAttributes.ordinal()] = 15;
            iArr[BackendErrorCode.BackendInvalidSubscriberAttributesBody.ordinal()] = 16;
            iArr[BackendErrorCode.BackendInvalidAppStoreSharedSecret.ordinal()] = 17;
            iArr[BackendErrorCode.BackendInvalidAppleSubscriptionKey.ordinal()] = 18;
            iArr[BackendErrorCode.BackendBadRequest.ordinal()] = 19;
            iArr[BackendErrorCode.BackendInternalServerError.ordinal()] = 20;
            iArr[BackendErrorCode.BackendProductIDsMalformed.ordinal()] = 21;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PurchasesError toPurchasesError(Exception exc) {
        if (exc instanceof JSONException ? true : exc instanceof IOException) {
            return new PurchasesError(PurchasesErrorCode.NetworkError, exc.getLocalizedMessage());
        }
        return exc instanceof SecurityException ? new PurchasesError(PurchasesErrorCode.InsufficientPermissionsError, ((SecurityException) exc).getLocalizedMessage()) : new PurchasesError(PurchasesErrorCode.UnknownError, exc.getLocalizedMessage());
    }

    private static final PurchasesErrorCode toPurchasesErrorCode(BackendErrorCode backendErrorCode) {
        switch (WhenMappings.$EnumSwitchMapping$0[backendErrorCode.ordinal()]) {
            case 1:
                return PurchasesErrorCode.StoreProblemError;
            case 2:
                return PurchasesErrorCode.ReceiptAlreadyInUseError;
            case 3:
                return PurchasesErrorCode.InvalidReceiptError;
            case 4:
            case 5:
            case 6:
                return PurchasesErrorCode.InvalidCredentialsError;
            case 7:
            case 8:
                return PurchasesErrorCode.PurchaseInvalidError;
            case 9:
                return PurchasesErrorCode.InvalidAppUserIdError;
            case 10:
                return PurchasesErrorCode.StoreProblemError;
            case 11:
            case 12:
                return PurchasesErrorCode.ConfigurationError;
            case 13:
                return PurchasesErrorCode.StoreProblemError;
            case 14:
                return PurchasesErrorCode.IneligibleError;
            case 15:
            case 16:
                return PurchasesErrorCode.InvalidSubscriberAttributesError;
            case 17:
            case 18:
            case 19:
            case 20:
                return PurchasesErrorCode.UnexpectedBackendResponseError;
            case 21:
                return PurchasesErrorCode.UnsupportedError;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final PurchasesError toPurchasesError(BackendErrorCode backendErrorCode, String str) {
        return new PurchasesError(toPurchasesErrorCode(backendErrorCode), str);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public static final PurchasesError toPurchasesError(HTTPResult hTTPResult) throws JSONException {
        Integer numValueOf;
        String str;
        PurchasesError purchasesError;
        Object obj;
        if (hTTPResult.getBody().has("code")) {
            Object obj2 = hTTPResult.getBody().get("code");
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            numValueOf = Integer.valueOf(((Integer) obj2).intValue());
        } else {
            numValueOf = null;
        }
        if (hTTPResult.getBody().has("message")) {
            Object obj3 = hTTPResult.getBody().get("message");
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str = (String) obj3;
        } else {
            str = "";
        }
        if (numValueOf != null) {
            BackendErrorCode backendErrorCodeValueOf = BackendErrorCode.Companion.valueOf(numValueOf.intValue());
            if (backendErrorCodeValueOf == null || (purchasesError = toPurchasesError(backendErrorCodeValueOf, str)) == null) {
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownBackendError;
                StringBuilder sb = new StringBuilder("Backend Code: ");
                obj = numValueOf;
                if (numValueOf == null) {
                    obj = "N/A";
                }
                sb.append(obj);
                sb.append(" - ");
                sb.append(str);
                purchasesError = new PurchasesError(purchasesErrorCode, sb.toString());
            }
        } else {
            PurchasesErrorCode purchasesErrorCode2 = PurchasesErrorCode.UnknownBackendError;
            StringBuilder sb2 = new StringBuilder("Backend Code: ");
            obj = numValueOf;
            if (numValueOf == null) {
                obj = "N/A";
            }
            sb2.append(obj);
            sb2.append(" - ");
            sb2.append(str);
            purchasesError = new PurchasesError(purchasesErrorCode2, sb2.toString());
        }
        return purchasesError;
    }
}
