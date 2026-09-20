package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0731Kl {
    public static C0731Kl A00;
    public static byte[] A01;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, 23, 24, 41, 0, 23, 26, 31, 18, 23, 2, 31, 25, 24, 41, 3, 3, 31, 18, 96, 108, 103, 102, 16, 21, 0, 21, 103, 98, 119, 98, 76, 97, 105, 102, 96, 119, 35, 106, 112, 35, 109, 118, 111, 111, 65, 68, 81, 68, 122, 72, 74, 65, 64, 73, 122, 81, 92, 85, 64, 44, 45, 46, 33, 38, 33, 60, 33, 39, 38, 69, 82, 82, 79, 82, 87, 84, 80, 69, 68, 67, 84, 110, 82, 94, 95, 87, 88, 86, 66, 74, 92, 92, 78, 72, 74, 21, 9, 4, 6, 0, 8, 0, 11, 17, 22, 22, 16, 3, 1, 9, 7, 16, 17, 77, 64, 73, 92};
    }

    static {
        A05();
        A00 = new C0731Kl();
    }

    public static synchronized C0731Kl A00() {
        return A00;
    }

    private C0974Ty A01(C1075Xy c1075Xy, JSONObject jSONObject, long j) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(124, 10, 18)).getJSONObject(0);
        C9H c9h = new C9H(C9I.A00(jSONObject2.getJSONObject(A04(88, 10, 63))), jSONObject2.optString(A04(103, 14, 70)), jSONObject2.optString(A04(0, 19, 98)));
        String strA04 = A04(26, 3, 57);
        if (jSONObject2.has(strA04)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(strA04);
            for (int i = 0; i < i; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                C0713Jr.A06(c1075Xy, jSONObject3, j, null);
                String strOptString = jSONObject3.optString(A04(19, 7, 39));
                String adapter = A04(73, 15, 82);
                String strOptString2 = jSONObject3.optString(adapter);
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(A04(51, 4, 3));
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray(A04(134, 8, 21));
                if (jSONObjectOptJSONObject != null) {
                    c9h.A09(new C9F(strOptString, strOptString2, jSONObjectOptJSONObject, jSONArrayOptJSONArray));
                } else {
                    c1075Xy.A0D().A4Z(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(55, 18, 116));
                }
            }
        }
        return new C0974Ty(c9h, jSONObject.optString(A04(29, 18, 1)));
    }

    private C0973Tx A02(JSONObject jSONObject) {
        return new C0973Tx(jSONObject.optString(A04(117, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, 116), 0), null);
    }

    private C0973Tx A03(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(124, 10, 18)).getJSONObject(0);
            C9I c9iA00 = C9I.A00(jSONObject2.getJSONObject(A04(88, 10, 63)));
            String strOptString = jSONObject2.optString(A04(103, 14, 70));
            String featureConfig = A04(0, 19, 98);
            String strOptString2 = jSONObject2.optString(featureConfig);
            String strA04 = A04(117, 7, 88);
            String adReportingConfig = A04(0, 0, 87);
            String strOptString3 = jSONObject.optString(strA04, adReportingConfig);
            String adReportingConfig2 = A04(47, 4, 116);
            return new C0973Tx(strOptString3, jSONObject.optInt(adReportingConfig2, 0), new C9H(c9iA00, strOptString, strOptString2));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C0733Kn A06(C1075Xy c1075Xy, String str, long j) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(A04(142, 4, 78));
            byte b = -1;
            int iHashCode = strOptString.hashCode();
            String strA04 = A04(98, 5, 87);
            if (iHashCode != 96432) {
                if (iHashCode == 96784904 && strOptString.equals(strA04)) {
                    b = 1;
                }
            } else if (strOptString.equals(A04(26, 3, 57))) {
                b = 0;
            }
            if (b == 0) {
                return A01(c1075Xy, jSONObject, j);
            }
            if (b != 1) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strA04);
                if (jSONObjectOptJSONObject != null) {
                    return A02(jSONObjectOptJSONObject);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new C0733Kn(EnumC0732Km.A04);
    }
}
