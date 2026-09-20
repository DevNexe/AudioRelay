package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7J {

    @Nullable
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"ezGqyoPIPKHN83WiKVVevBWkG3P1qDlE", "bHUhqeCZStL3hoLiFuX7aDXMTtUO4SRK", "6mH", "l35BhcLqTpkfPgrTHobWQpDf1vW4Njv0", "2S1uYpKXPbyDBdggYjHCHIIoGx5rp2pm", "U07LIPTAxvw3Yt20DQWphksDXSc1ydWN", "nWa8vBGdC70OTVh7jsXfRaHUkJPGOS0P", "NNhGFPrdPRblbbvf05CBiQrYmSBt33Cu"};

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{117, 96, 98, 40, 109, 86, 91, 74, 15, 110, 93, 93, 78, 86, 15, 70, 92, 15, 65, 90, 67, 67, 87, 81, 4, 2, 47};
    }

    static {
        A0A();
        A00 = null;
    }

    public static float A00(float f) {
        return new BigDecimal(f).setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    public static long A01() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "oi1AWXaprIq3DsGdE2VtVNFOHzfK44CR";
        strArr2[1] = "VDiC0kXnWwp3KFPy20II1epcnqCnwjCl";
        return jElapsedRealtime;
    }

    public static long A02(long j) {
        return j - (j % 1048576);
    }

    @SuppressLint({"CatchGeneralException"})
    public static EnumC04146w A03(@Nullable String str) {
        String strA06 = A06(24, 2, 121);
        if (str == null || str.isEmpty()) {
            return EnumC04146w.A04;
        }
        try {
            JSONObject bdObject = new JSONObject(str).getJSONObject(A06(22, 2, 58));
            if (bdObject == null) {
                return EnumC04146w.A04;
            }
            if (bdObject.has(strA06)) {
                return EnumC04146w.A00(bdObject.getInt(strA06));
            }
            return EnumC04146w.A04;
        } catch (Throwable unused) {
        }
    }

    public static YD A04(String str, Throwable th) {
        if (th instanceof NullPointerException) {
            return new YD(A01(), new AnonymousClass78(str), new AnonymousClass77(AnonymousClass76.A07));
        }
        boolean z = th instanceof SecurityException;
        if (A02[3].charAt(27) != 'P') {
            A02[7] = "UmchuACFheILBJlaih7XmvNlXQtm6iWO";
            if (z) {
                return new YD(A01(), new AnonymousClass78(str), new AnonymousClass77(AnonymousClass76.A06));
            }
            if (!(th instanceof UnsupportedOperationException)) {
                boolean z2 = th instanceof NoSuchAlgorithmException;
                if (A02[0].charAt(9) != 'T') {
                    A02[3] = "x60dR1TMPSfTuY8uuU5k4CgjQFfD2Ly1";
                    if (!z2) {
                        return new YD(A01(), new AnonymousClass78(str), new AnonymousClass77(th));
                    }
                }
            }
            return new YD(A01(), new AnonymousClass78(str), new AnonymousClass77(AnonymousClass76.A05));
        }
        throw new RuntimeException();
    }

    @SuppressLint({"BadMethodUse-java.util.UUID.randomUUID"})
    public static String A05() {
        if (A00 == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                A00 = UUID.randomUUID().toString();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return A00;
    }

    @Nullable
    @SuppressLint({"EmptyCatchBlock"})
    public static String A07(String str) {
        String strA06 = A06(26, 1, 84);
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(strA06)) {
                return null;
            }
            string = Integer.toString(jSONObject.getInt(strA06));
            return string;
        } catch (JSONException unused) {
            return string;
        }
    }

    public static String A08(byte[] bArr, C7I c7i) throws NoSuchAlgorithmException {
        if (bArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i : MessageDigest.getInstance(c7i.A02()).digest(bArr)) {
                String hex = String.format(A06(0, 4, 95), Integer.valueOf(i & 255));
                stringBuffer.append(hex);
            }
            return stringBuffer.toString();
        }
        throw new NullPointerException(A06(4, 18, 32));
    }

    public static Map<String, String> A09(C6C c6c) {
        HashMap map = new HashMap();
        map.put(C6K.A04.A02(), A05());
        map.put(C6K.A0A.A02(), Long.toString(TimeUnit.SECONDS.toMillis(c6c.A0T())));
        map.put(C6K.A06.A02(), Long.toString(C04156x.A00()));
        map.put(C6K.A07.A02(), Integer.toString(c6c.A0S()));
        map.put(C6K.A09.A02(), Integer.toString(c6c.A0V()));
        map.put(C6K.A05.A02(), Integer.toString(c6c.A0R()));
        map.put(C6K.A08.A02(), A07(c6c.A0h()));
        return map;
    }

    public static void A0B(C6C c6c, String str, @Nullable String str2) {
        C6L c6lA0X = c6c.A0X();
        if (c6lA0X == null) {
            return;
        }
        c6lA0X.A9A(C6I.A05.A02(), str, A09(c6c), str2, null, null, null);
    }

    public static boolean A0C() {
        int i = Build.VERSION.SDK_INT;
        if (A02[6].charAt(4) != 'v') {
            throw new RuntimeException();
        }
        A02[4] = "tyMFX1CpOJYUV0MeMpbopAmdAMzcot7c";
        return i >= 29;
    }

    public static boolean A0D() {
        ActivityManager.RunningAppProcessInfo appProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(appProcessInfo);
        return appProcessInfo.importance != 100;
    }

    public static boolean A0E(EnumC04146w enumC04146w) {
        int reputationTierValue = enumC04146w.A03();
        return reputationTierValue == EnumC04146w.A05.A03() || reputationTierValue == EnumC04146w.A07.A03() || reputationTierValue == EnumC04146w.A06.A03();
    }

    public static boolean A0F(@Nullable String str, @Nullable String str2) {
        if (str != null || str2 != null) {
            if (str == null || str2 == null) {
                return false;
            }
            return str.equals(str2);
        }
        if (A02[2].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "CRUhUvJCPqF3o50vaOZhXgSSPBMouYyY";
        strArr[1] = "Hcx4PZUYJ7P3vk50CiSuOhi8dLkBnJKe";
        return true;
    }
}
