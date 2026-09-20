package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02510k {
    public static byte[] A06;
    public static String[] A07 = {"DvSn6PhmC3i7LdpG0vBUuRZmjagS5as7", "VQCZ7hz", "zA4klKNJM0QxWDxEFTSTi5yKhMV68", "2vimyyNbMv6AohadWhJSDQSQPpWOARjH", "MVolmMMkLKfWmTv", "tHNO368kkNAVpLeIneqpL6ODf8V7me71", "x8Jgc8MGjZsmc", "KvaBSJwcdZeuQnxX6yqoEJJZ8c4KCJ2u"};
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{67, 82, 82, 81, 75, 86, 71, 97, 112, 112, 115, 105, 116, 101, 95, 117, 114, 108, 38, 33, 44, 44, 34, 33, 35, 43, 31, 53, 50, 44, 5, 11, 23, 49, 6, 15, 29, 6, 11, 29, 122, 118, 101, 124, 114, 99, 72, 98, 101, 126, 26, 11, 9, 1, 11, 13, 15};
    }

    static {
        A02();
    }

    public C02510k(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    public static C02510k A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A01(50, 7, 38));
        String strOptString2 = jSONObject.optString(A01(0, 7, 110));
        String strOptString3 = jSONObject.optString(A01(7, 11, 76));
        String appsiteUri = A01(30, 10, 34);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteUri);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < i; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
                String appsite = A07[5];
                if (appsite.charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                A07[2] = "wfKFQtpS7p7Zsd7MRi5uYuHrlLf6T";
            }
        }
        String strOptString4 = jSONObject.optString(A01(40, 10, 91));
        String mPackageName = jSONObject.optString(A01(18, 12, 12));
        return new C02510k(strOptString, strOptString2, strOptString3, arrayList, strOptString4, mPackageName);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A04;
    }
}
