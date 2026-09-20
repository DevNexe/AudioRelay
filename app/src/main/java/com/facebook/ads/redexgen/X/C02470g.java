package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02470g {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, 26, 48, 55, 41};
    }

    static {
        A03();
        A01 = C02470g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC02460f A00(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c1075Xy, interfaceC0703Jh, str, uri, extraData, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    @Nullable
    public static AbstractC02460f A01(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, @Nullable Uri uri, Map<String, String> map, boolean z, boolean z2) {
        C02520m c02520mA00;
        byte b;
        int iHashCode;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String action = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(91, 9, 100));
        String dataJson = uri.getQueryParameter(A02(45, 4, 86));
        if (dataJson != null && !TextUtils.isEmpty(dataJson)) {
            try {
                JSONObject jSONObject = new JSONObject(dataJson);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String dataJson2 = itKeys.next();
                    try {
                        map.put(dataJson2, jSONObject.getString(dataJson2));
                    } catch (JSONException e) {
                        e = e;
                        c1075Xy.A06().A8y(A02(64, 7, 51), C04578z.A22, new AnonymousClass90(e));
                        Log.w(A01, A02(0, 45, 27), e);
                        c02520mA00 = C02520m.A00(interfaceC0703Jh, ActivityUtils.A00());
                        b = -1;
                        iHashCode = action.hashCode();
                        if (iHashCode != -1458789996) {
                            if (iHashCode != 109770977) {
                                if (iHashCode == 1546100943) {
                                    b = 1;
                                }
                            } else if (action.equals(A02(82, 5, 117))) {
                                b = 0;
                            }
                        } else if (action.equals(A02(71, 11, 74))) {
                            b = 2;
                        }
                        if (b != 0) {
                            if (queryParameter != null) {
                                return null;
                            }
                            return new G2(c1075Xy, interfaceC0703Jh, str, uri, map, c02520mA00, z);
                        }
                        if (b != 1) {
                            if (b != 2) {
                                return new Cdo(c1075Xy, interfaceC0703Jh, str, uri, map);
                            }
                            return new C1358dn(c1075Xy, interfaceC0703Jh, str, uri);
                        }
                        if (A02(87, 4, 122).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                            return new C0619Fz(c1075Xy, interfaceC0703Jh, str, uri, map, c02520mA00, z);
                        }
                        return z2 ? new G1(c1075Xy, interfaceC0703Jh, str, uri, map) : new G0(c1075Xy, interfaceC0703Jh, str, uri, map, c02520mA00, z);
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        c02520mA00 = C02520m.A00(interfaceC0703Jh, ActivityUtils.A00());
        b = -1;
        iHashCode = action.hashCode();
        if (iHashCode != -1458789996) {
            if (iHashCode != 109770977) {
                if (iHashCode == 1546100943 && action.equals(A02(55, 9, 15))) {
                    b = 1;
                }
            } else if (action.equals(A02(82, 5, 117))) {
                b = 0;
            }
        } else if (action.equals(A02(71, 11, 74))) {
            b = 2;
        }
        if (b != 0) {
            if (queryParameter != null) {
                return null;
            }
            return new G2(c1075Xy, interfaceC0703Jh, str, uri, map, c02520mA00, z);
        }
        if (b != 1) {
            if (b != 2) {
                return new Cdo(c1075Xy, interfaceC0703Jh, str, uri, map);
            }
            return new C1358dn(c1075Xy, interfaceC0703Jh, str, uri);
        }
        if (A02(87, 4, 122).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
            return new C0619Fz(c1075Xy, interfaceC0703Jh, str, uri, map, c02520mA00, z);
        }
        if (z2) {
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
