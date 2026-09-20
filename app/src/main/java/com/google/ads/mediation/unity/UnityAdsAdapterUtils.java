package com.google.ads.mediation.unity;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static AdError a(int i, String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static AdError b(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        int i;
        int i2 = QnHx.b[unityAdsInitializationError.ordinal()];
        if (i2 == 1) {
            i = 301;
        } else if (i2 != 2) {
            i = i2 != 3 ? RCHTTPStatusCodes.UNSUCCESSFUL : 303;
        } else {
            i = 302;
        }
        return a(i, str);
    }

    public static AdError c(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i;
        int i2 = QnHx.c[unityAdsLoadError.ordinal()];
        if (i2 == 1) {
            i = 401;
        } else if (i2 == 2) {
            i = 402;
        } else if (i2 == 3) {
            i = 403;
        } else if (i2 != 4) {
            i = i2 != 5 ? 400 : 405;
        } else {
            i = RCHTTPStatusCodes.NOT_FOUND;
        }
        return a(i, str);
    }

    public static AdError d(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        int i;
        switch (QnHx.d[unityAdsShowError.ordinal()]) {
            case 1:
                i = 501;
                break;
            case 2:
                i = 502;
                break;
            case 3:
                i = 503;
                break;
            case 4:
                i = 504;
                break;
            case 5:
                i = 505;
                break;
            case 6:
                i = 506;
                break;
            case 7:
                i = 507;
                break;
            default:
                i = RCHTTPStatusCodes.ERROR;
                break;
        }
        return a(i, str);
    }

    public static UnityBannerSize getUnityBannerSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize != null) {
            return new UnityBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        return null;
    }
}
