package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9N {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-56, -7, -10, -56, -52, -8, -57, -58, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0743Ky A00() {
        return new C1059Xi();
    }

    public static LE A01(C1074Xx c1074Xx) {
        return new C1058Xh(c1074Xx);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        MM.A01.execute(new C1060Xj(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C1074Xx c1074Xx) {
        if (JT.A0P(c1074Xx) && !A05.getAndSet(true)) {
            try {
                C04488p reportHandler = new C04488p(Thread.getDefaultUncaughtExceptionHandler(), c1074Xx, new C1056Xf());
                Thread.setDefaultUncaughtExceptionHandler(reportHandler);
            } catch (Exception e) {
                c1074Xx.A06().A8y(A02(181, 7, 62), C04578z.A1X, new AnonymousClass90(e));
            }
        }
    }

    public static void A07(C1074Xx c1074Xx) {
        A0G(c1074Xx, null, null, 3);
    }

    public static void A08(C1074Xx c1074Xx) {
        A0G(c1074Xx, null, null, 3);
    }

    public static void A09(C1074Xx c1074Xx) {
        if (JR.A1b(c1074Xx)) {
            A0E(c1074Xx, 0);
        }
        if (JR.A1i(c1074Xx)) {
            A0B(c1074Xx);
        }
    }

    public static void A0A(C1074Xx c1074Xx) {
        if (JR.A1c(c1074Xx)) {
            A0F(c1074Xx, null, 3);
        }
    }

    public static void A0B(C1074Xx c1074Xx) {
        MX.A06.execute(new C1061Xk(c1074Xx));
    }

    public static void A0C(C1074Xx c1074Xx) {
        C04518t.A0C(c1074Xx, new C1055Xe(c1074Xx), new C1065Xo(), BuildConfigApi.isDebug());
        c1074Xx.A08();
        AnonymousClass68.A04(c1074Xx, null);
    }

    public static void A0E(C1074Xx c1074Xx, int i) {
        C8T.A01(c1074Xx);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            KV.A02();
        }
        A06(c1074Xx);
        LB.A00(JR.A0k(c1074Xx), BuildConfigApi.isDebug(), A00(), A01(c1074Xx));
        AnonymousClass61.A03(JR.A02(c1074Xx));
        RK.A09(new C1057Xg(c1074Xx));
        if (i == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c1074Xx.A06().A9I(A02(178, 3, 33), C04578z.A0R, new AnonymousClass90(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c1074Xx, AudienceNetworkActivity.class);
        MX.A05(c1074Xx);
        C0714Js.A05(c1074Xx);
        C02600u.A01(c1074Xx);
        if (JR.A0u(c1074Xx)) {
            C03654y.A00(c1074Xx);
        }
        if (JR.A1I(c1074Xx)) {
            XW.A02().A7N(c1074Xx);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C1074Xx c1074Xx, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C8T.A01(c1074Xx);
        boolean z = false;
        synchronized (C9N.class) {
            if (!A00) {
                if (i != 1 && i != 2) {
                    if (i == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0E(c1074Xx, i);
            MX.A08.execute(new C1062Xl(c1074Xx, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String strA02 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C9M(true, strA02));
            } else {
                Log.w(A02(8, 17, 60), strA02);
            }
        }
    }

    public static void A0G(C1074Xx c1074Xx, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        KV.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        RK.A06();
        A0F(c1074Xx, initListener, i);
    }

    public static synchronized boolean A0H() {
        return A00;
    }
}
