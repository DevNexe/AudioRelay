package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LZ {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-47, -17, -4, -75, 2, -82, 1, 2, -17, 0, 2, -82, -49, 3, -14, -9, -13, -4, -15, -13, -36, -13, 2, 5, -3, 0, -7, -49, -15, 2, -9, 4, -9, 2, 7, -68, -82, -37, -17, -7, -13, -82, 1, 3, 0, -13, -82, 2, -10, -17, 2, -82, -9, 2, -75, 1, -82, -9, -4, -82, 7, -3, 3, 0, -82, -49, -4, -14, 0, -3, -9, -14, -37, -17, -4, -9, -12, -13, 1, 2, -68, 6, -5, -6, -82, -12, -9, -6, -13, -68, -15, -19, -20, 32, 15, 20, 16, 25, 14, 16, -7, 16, 31, 34, 26, 29, 22, -26, -13, -28, -26, -24, -7, -18, -5, -18, -7, -2, 24, 37, 27, 41, 38, 32, 27, -27, 32, 37, 43, 28, 37, 43, -27, 24, 26, 43, 32, 38, 37, -27, 13, 0, -4, 14, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -58, -60, -41, -56, -54, -46, -43, -36, -111, -91, -75, -78, -70, -74, -92, -91, -81, -88, -32, -16, -19, -11, -15, -29, -16, -45, -48, -54, -23, -25, -14, -14, -21, -8, -49, -22, -82, -73, -76, -80, -71, -65, -97, -70, -74, -80, -71, -56, -44, -46, -109, -58, -45, -55, -41, -44, -50, -55, -109, -57, -41, -44, -36, -40, -54, -41, -109, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -60, -50, -55, -47, -35, -37, -100, -49, -36, -46, -32, -35, -41, -46, -100, -28, -45, -36, -46, -41, -36, -43, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -22, -32, -13, -32, -19, -32, -89, -74, -87, -91, -72, -87, -93, -78, -87, -69, -93, -72, -91, -90, -13, -17, -70, -77, -64, -74, -66, -73, -60, -90, -69, -65, -73, -73, -61, -61, -65, -34, -22, -22, -26, -80, -91, -91, -26, -30, -41, -17, -92, -35, -27, -27, -35, -30, -37, -92, -39, -27, -29, -91, -23, -22, -27, -24, -37, -91, -41, -26, -26, -23, -91, -67, -55, -55, -59, -56, -67, -79, -62, -69, -75, -60, -54, -47, -64, -51, -57, -68, -44, 37, 33, 22, 46, -29, 28, 36, 36, 28, 33, 26, -29, 24, 36, 34, 12, -1, -5, 13, -22, 15, 6, -5};
    }

    static {
        A04();
    }

    public static Intent A00(Uri uri) {
        Intent intent = new Intent(A03(118, 26, 123), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    @VisibleForTesting
    public static Intent A01(C1075Xy c1075Xy, Uri uri) {
        Intent intentA00 = A00(uri);
        intentA00.addCategory(A03(144, 33, 39));
        intentA00.addFlags(268435456);
        intentA00.putExtra(A03(206, 34, 41), c1075Xy.getPackageName());
        intentA00.putExtra(A03(278, 14, 8), false);
        if (JR.A1M(c1075Xy)) {
            if (A03(292, 2, 81).equals(uri.getScheme())) {
                intentA00.setPackage(A03(259, 19, 67));
            }
        }
        return intentA00;
    }

    public static Intent A02(C1075Xy c1075Xy, Uri uri) {
        Intent intentA00 = A00(uri);
        intentA00.setPackage(A03(240, 19, 50));
        intentA00.putExtra(A03(187, 8, 74), c1075Xy.getPackageName());
        intentA00.putExtra(A03(354, 7, 31), true);
        return intentA00;
    }

    private void A05(C1075Xy c1075Xy, Uri uri) throws LL {
        LN.A0B(c1075Xy, A01(c1075Xy, uri));
    }

    private final void A06(C1075Xy c1075Xy, Uri uri) throws LX, LL {
        if (A0C(c1075Xy)) {
            if (JR.A1f(c1075Xy) && LN.A0C(c1075Xy, A02(c1075Xy, uri))) {
                return;
            }
            Intent intentA01 = A01(c1075Xy, uri);
            intentA01.setPackage(A03(240, 19, 50));
            LN.A0B(c1075Xy, intentA01);
            return;
        }
        throw new LX();
    }

    private void A07(C1075Xy c1075Xy, Uri uri, String str) {
        AdActivityIntent adActivityIntentA04 = LN.A04(c1075Xy);
        adActivityIntentA04.addFlags(268435456);
        adActivityIntentA04.putExtra(A03(376, 8, 90), EnumC0736Kq.A02);
        adActivityIntentA04.putExtra(A03(177, 10, 66), uri.toString());
        adActivityIntentA04.putExtra(A03(195, 11, 15), str);
        adActivityIntentA04.putExtra(A03(294, 11, 22), System.currentTimeMillis());
        try {
            LN.A09(c1075Xy, adActivityIntentA04);
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c1075Xy.A06().A8y(A03(107, 11, 73), C04578z.A0D, new AnonymousClass90(cause2));
            Log.e(A03(90, 17, 111), A03(0, 90, 82), cause2);
        }
    }

    private final void A08(C1075Xy c1075Xy, Uri uri, String str) throws LL {
        boolean zA05 = JS.A05(c1075Xy);
        if (A0B(uri) && zA05) {
            A07(c1075Xy, uri, str);
        } else {
            c1075Xy.A0D().A89(zA05);
            A05(c1075Xy, uri);
        }
    }

    public static void A09(LZ lz, C1075Xy c1075Xy, Uri uri, String str) {
        lz.A0D(c1075Xy, uri, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public static void A0A(LZ lz, C1075Xy c1075Xy, Uri uri, String str) throws LL {
        boolean z;
        if (A0B(uri)) {
            if (A03(361, 15, 121).equals(uri.getHost())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (A03(348, 6, 20).equals(uri.getScheme()) || z) {
            try {
                lz.A06(c1075Xy, uri);
                return;
            } catch (LX unused) {
                lz.A08(c1075Xy, uri, str);
                return;
            }
        }
        lz.A08(c1075Xy, uri, str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static boolean A0B(Uri uri) {
        boolean z;
        String scheme;
        if (Build.VERSION.SDK_INT >= 24) {
            boolean zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            String[] strArr = A01;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[7] = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK";
            if (zIsCleartextTrafficPermitted || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String scheme2 = uri.getScheme();
        if (z) {
            String scheme3 = A03(305, 4, 19);
            if (!scheme3.equalsIgnoreCase(scheme2)) {
                scheme = A03(343, 5, 25);
                if (scheme.equalsIgnoreCase(scheme2)) {
                    return false;
                }
            }
        } else {
            scheme = A03(343, 5, 25);
            if (scheme.equalsIgnoreCase(scheme2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A0C(C1075Xy c1075Xy) {
        for (ResolveInfo appInfo : c1075Xy.getPackageManager().queryIntentActivities(new Intent(A03(118, 26, 123), C0745La.A00(A03(309, 34, 58))), 0)) {
            if (appInfo.activityInfo.applicationInfo.packageName.equals(A03(240, 19, 50))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0D(C1075Xy c1075Xy, Uri uri, String str) {
        return LN.A0E(c1075Xy, uri, str);
    }

    public static boolean A0E(LZ lz, C1075Xy c1075Xy, Uri uri, String str) {
        try {
            A0A(lz, c1075Xy, uri, str);
            return true;
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c1075Xy.A06().A8y(A03(107, 11, 73), C04578z.A05, new AnonymousClass90(cause2));
            return false;
        }
    }
}
