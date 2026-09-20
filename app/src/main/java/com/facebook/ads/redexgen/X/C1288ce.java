package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardedAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1288ce implements AnonymousClass22 {
    public static byte[] A04;
    public static String[] A05 = {"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    public final AbstractC1300cq A00;
    public final InterfaceC02871v A01;
    public final AnonymousClass20 A02;
    public final C1075Xy A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, 23, 1, 6, 14, -7, 4, 1, -4, -7, 12, 1, 7, 6, 23, 12, 1, 5, -3, 23, 3, -3, 17, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, 19, 12};
    }

    static {
        A01();
    }

    public C1288ce(C1075Xy c1075Xy, AnonymousClass20 anonymousClass20, InterfaceC02871v interfaceC02871v, AbstractC1300cq abstractC1300cq) {
        this.A03 = c1075Xy;
        this.A02 = anonymousClass20;
        this.A01 = interfaceC02871v;
        this.A00 = abstractC1300cq;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x012f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    public final void A80(Message message) {
        RewardedAdListener rewardedAdListenerA04;
        String[] strArr;
        InterstitialAd interstitialAdA01 = this.A02.A01();
        String strA00 = A00(152, 3, 106);
        if (interstitialAdA01 == null) {
            this.A03.A06().A8y(strA00, C04578z.A0K, new AnonymousClass90(A00(0, 17, 57)));
            return;
        }
        int i = message.what;
        String strA01 = A00(95, 9, 61);
        String strA02 = A00(104, 27, 56);
        String strA03 = A00(17, 17, 18);
        if (i != 10) {
            if (i == 1020) {
                this.A01.AEc();
                Bundle bundle = message.getData().getBundle(strA03);
                if (bundle != null) {
                    this.A02.A0B(bundle.getLong(A00(69, 26, 127)));
                } else {
                    this.A03.A06().A8y(strA00, C04578z.A0V, new AnonymousClass90(strA02, strA01 + message));
                }
                this.A02.A0C(null);
            } else {
                if (A05[4].charAt(15) != 'R') {
                    A05[2] = "aJfdsH08DFQiAUsDka0Nh1fTZA9JZGsz";
                    if (i == 1022) {
                        this.A01.AEi();
                    } else if (i != 1023) {
                        switch (i) {
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A02.A02() == null) {
                return;
            }
            switch (message.what) {
                case 1020:
                    this.A02.A02().onAdLoaded(interstitialAdA01);
                    return;
                case 1021:
                    this.A02.A02().onInterstitialDisplayed(interstitialAdA01);
                    return;
                case 1022:
                    this.A02.A02().onInterstitialDismissed(interstitialAdA01);
                    return;
                case 1023:
                default:
                    rewardedAdListenerA04 = this.A02.A04();
                    strArr = A05;
                    if (strArr[3].length() != strArr[7].length()) {
                        A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                        if (rewardedAdListenerA04 == null) {
                            return;
                        }
                        switch (message.what) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                if (A05[2].charAt(18) != 'n') {
                                    String[] strArr2 = A05;
                                    strArr2[1] = "IMuRostxJ5htnzhiOcsxYcu1iidsGUgj";
                                    strArr2[5] = "ubJ4M5GxN6FfPval4rtOnbhl8vPUgGKC";
                                    return;
                                }
                                break;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    throw new RuntimeException();
                case 1024:
                    this.A02.A02().onAdClicked(interstitialAdA01);
                    return;
                case 1025:
                    this.A02.A02().onLoggingImpression(interstitialAdA01);
                    return;
                case 1026:
                    if (this.A02.A02() instanceof InterstitialAdExtendedListener) {
                        InterstitialAdListener interstitialAdListenerA02 = this.A02.A02();
                        if (A05[2].charAt(18) != 'n') {
                            String[] strArr3 = A05;
                            strArr3[1] = "4ubpoteMIucGsWyTMsTtOH4ZOdBl9bHr";
                            strArr3[5] = "Xxx4qDjyhZoijrhiIp4u1mFMOEMCLZoL";
                            ((InterstitialAdExtendedListener) interstitialAdListenerA02).onInterstitialActivityDestroyed();
                        } else {
                            ((InterstitialAdExtendedListener) interstitialAdListenerA02).onInterstitialActivityDestroyed();
                        }
                    }
                    rewardedAdListenerA04 = this.A02.A04();
                    strArr = A05;
                    if (strArr[3].length() != strArr[7].length()) {
                        A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                        if (rewardedAdListenerA04 == null) {
                            return;
                        }
                        switch (message.what) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                if (A05[2].charAt(18) != 'n') {
                                    String[] strArr4 = A05;
                                    strArr4[1] = "IMuRostxJ5htnzhiOcsxYcu1iidsGUgj";
                                    strArr4[5] = "ubJ4M5GxN6FfPval4rtOnbhl8vPUgGKC";
                                    return;
                                }
                                break;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    throw new RuntimeException();
            }
        }
        Bundle bundle2 = message.getData();
        Bundle bundle3 = bundle2.getBundle(strA03);
        if (bundle3 != null) {
            int i2 = bundle3.getInt(A00(51, 18, 39));
            String string = bundle3.getString(A00(131, 21, 21));
            AdError error = new AdError(i2, string);
            this.A01.AEY(error);
            if (this.A02.A02() != null) {
                this.A02.A02().onError(interstitialAdA01, error);
            } else {
                Log.e(A00(34, 17, 55), string);
            }
        } else {
            this.A01.AEV(EnumC02861u.A05);
            this.A03.A06().A8y(strA00, C04578z.A0V, new AnonymousClass90(strA02, strA01 + message));
        }
        this.A02.A0C(null);
    }
}
