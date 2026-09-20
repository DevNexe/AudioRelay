package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03996h {
    public static final String A08 = C03996h.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C6C A02;
    public final C6T A03;
    public final C1198b7 A04;
    public final C1197b6 A05;
    public final C1196b5 A06;
    public final C7E A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6k] */
    public C03996h(final Context context, final C6C c6c) {
        final C04036l c04036l = new C04036l(new C04056n(context, c6c));
        ?? r2 = new Object(context, c04036l, c6c) { // from class: com.facebook.ads.redexgen.X.6k
            public static byte[] A07;
            public static String[] A08 = {"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            public int A00;
            public final C6C A01;
            public final C1198b7 A02;
            public final C1197b6 A03;
            public final C1196b5 A04;
            public final C04036l A05;
            public final C7E A06;

            public static String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{-31, 4};
            }

            static {
                A04();
            }

            {
                this.A03 = new C1197b6(context, c6c);
                this.A04 = new C1196b5(context, c6c);
                this.A02 = new C1198b7(context, c6c);
                this.A06 = new C7E(context, c6c);
                this.A05 = c04036l;
                this.A01 = c6c;
                A05();
            }

            @Nullable
            public static C04126u A00(int i, String str, int i2, int i3) {
                if (i != 10300) {
                    if (i == 10920) {
                        return A01(str, i2, i3, EnumC04116t.A03);
                    }
                    if (i != 10940 && i != 10941) {
                        switch (i) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i2, i3, EnumC04116t.A04);
            }

            @Nullable
            public static C04126u A01(String str, int i, int i2, EnumC04116t enumC04116t) {
                int i3 = C04016j.A00[enumC04116t.ordinal()];
                if (i3 == 1) {
                    return new C04126u(Integer.valueOf(Integer.parseInt(str)), i, i2);
                }
                if (i3 != 2) {
                    return null;
                }
                return new C04126u(str, i, i2);
            }

            @Nullable
            private List<C04126u> A03(int i) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> mapA0i = this.A01.A0i();
                if (mapA0i == null || mapA0i.isEmpty() || !mapA0i.containsKey(Integer.valueOf(i))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(mapA0i.get(Integer.valueOf(i)));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i2 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i, next, i2, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A05() {
                String strA02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer numValueOf = jSONObject.has(strA02) ? Integer.valueOf(jSONObject.getInt(strA02)) : null;
                    if (numValueOf == null) {
                        return;
                    }
                    this.A00 = numValueOf.intValue();
                    this.A06.A06(this.A00);
                    A06(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    C6O.A03(th);
                }
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:57:0x0042 A[SYNTHETIC] */
            @SuppressLint({"BadMethodUse-android.util.Log.e"})
            private void A06(JSONArray jSONArray) throws Exception {
                JSONArray jSONArray2;
                InterfaceC04136v interfaceC04136vA01;
                Map<Integer, InterfaceC04136v> mapA02 = this.A05.A02();
                if (mapA02 == null) {
                    return;
                }
                for (int signalFlagsEncoded = 0; signalFlagsEncoded < jSONArray.length() && (jSONArray2 = jSONArray.getJSONArray(signalFlagsEncoded)) != null && jSONArray2.length() == 2; signalFlagsEncoded++) {
                    if ((jSONArray2.get(0) instanceof Integer) && (jSONArray2.get(1) instanceof Integer)) {
                        int i = jSONArray2.getInt(0);
                        EnumSet<EnumC04176z> enumSetA02 = EnumC04176z.A02(jSONArray2.getInt(1));
                        if (A07(enumSetA02)) {
                            continue;
                        } else if (enumSetA02.contains(EnumC04176z.A08)) {
                            this.A02.A02(new C04106s(i, enumSetA02, mapA02.get(Integer.valueOf(i))));
                        } else {
                            List<C04126u> listA03 = null;
                            boolean z = false;
                            if (enumSetA02.contains(EnumC04176z.A09)) {
                                listA03 = A03(i);
                                String[] strArr = A08;
                                if (strArr[0].length() != strArr[4].length()) {
                                    throw new RuntimeException();
                                }
                                A08[3] = "gbsbynt3Jt5Ibwn4XUi3JyTNvJgAjiLF";
                                z = true;
                            }
                            Integer numValueOf = Integer.valueOf(i);
                            String[] strArr2 = A08;
                            if (strArr2[1].charAt(14) != strArr2[5].charAt(14)) {
                                A08[7] = "VQtaGepZfQkON0ZRaGi6CJHbKlyPl2Xb";
                                if (!mapA02.containsKey(numValueOf)) {
                                    if (z) {
                                    }
                                }
                            } else {
                                String[] strArr3 = A08;
                                strArr3[2] = "gP534oAWxzuxTSvyS3V";
                                strArr3[6] = "569Auvwjd3shsCWoORD";
                                if (!mapA02.containsKey(numValueOf)) {
                                    if (z) {
                                    }
                                }
                            }
                            if (z) {
                                interfaceC04136vA01 = this.A05.A01(i, listA03);
                            } else {
                                interfaceC04136vA01 = mapA02.get(Integer.valueOf(i));
                            }
                            C04106s c04106s = new C04106s(i, enumSetA02, interfaceC04136vA01);
                            if (enumSetA02.contains(EnumC04176z.A07)) {
                                this.A06.A07(c04106s);
                            }
                            if (enumSetA02.contains(EnumC04176z.A0B)) {
                                this.A03.A03(c04106s);
                            } else {
                                this.A04.A02(c04106s);
                            }
                        }
                    }
                }
            }

            private final boolean A07(EnumSet<EnumC04176z> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC04176z.A05) && enumSet.contains(EnumC04176z.A06) && !enumSet.contains(EnumC04176z.A0A)) ? false : true;
            }

            public final int A08() {
                return this.A00;
            }

            public final C1198b7 A09() {
                return this.A02;
            }

            public final C1197b6 A0A() {
                return this.A03;
            }

            public final C1196b5 A0B() {
                return this.A04;
            }

            public final C7E A0C() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0A();
        this.A06 = r2.A0B();
        this.A04 = r2.A09();
        this.A00 = r2.A08();
        this.A02 = c6c;
        this.A03 = new C6T();
        this.A03.A01(this.A04);
        this.A07 = r2.A0C();
        this.A07.A05();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C6H<C7A>> mapA03 = C04156x.A01().A03();
        if (mapA03 == null || mapA03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : mapA03.keySet()) {
                List<C7A> listA03 = mapA03.get(num).A03();
                JSONArray jSONArray = new JSONArray();
                Iterator<C7A> it = listA03.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().A09(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC04146w enumC04146w, AnonymousClass70 anonymousClass70) {
        C6M c6mA0Y = this.A02.A0Y();
        if (c6mA0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            c6mA0Y.A9K(C7J.A05(), str, this.A00, enumC04146w.A03(), sessionEndTime, A00(), anonymousClass70);
        }
        C7J.A0B(this.A02, C6J.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC04146w enumC04146w) {
        this.A04.A03(enumC04146w, this.A01);
    }

    public final void A04(EnumC04166y enumC04166y, EnumC04146w enumC04146w, @Nullable String str) {
        A05(enumC04166y, enumC04146w, str, AnonymousClass70.A04);
    }

    public final void A05(EnumC04166y enumC04166y, EnumC04146w enumC04146w, @Nullable String str, AnonymousClass70 anonymousClass70) {
        this.A05.A04(enumC04146w);
        if (enumC04166y == EnumC04166y.A02) {
            this.A06.A03(enumC04146w);
            if (str != null) {
                A01(str, enumC04146w, anonymousClass70);
            }
        }
    }

    public final boolean A06() {
        List<C04106s> listA02 = this.A05.A02();
        return (listA02 == null || listA02.isEmpty()) ? false : true;
    }
}
