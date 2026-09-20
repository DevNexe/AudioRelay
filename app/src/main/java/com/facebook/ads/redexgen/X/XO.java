package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XO implements InterfaceC04649g {
    public static byte[] A03;
    public static final String A04;
    public final C1074Xx A00;
    public final InterfaceC04749r<C0700Je> A01;
    public final InterfaceC04749r<C0700Je> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, 24, 14, 74, 14, 11, 30, 11, 8, 11, 25, 15, 74, 12, 11, 3, 6, 31, 24, 15, 74, 5, 9, 9, 31, 24, 24, 15, 14, 74, 29, 2, 15, 4, 74, 24, 15, 11, 14, 3, 4, 13, 74, 15, 28, 15, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    static {
        A03();
        A04 = XO.class.getSimpleName();
    }

    public XO(C1074Xx c1074Xx) throws IOException {
        this.A00 = c1074Xx;
        this.A01 = new XL(C04719o.A00(A00(11, 28, 31), c1074Xx), new XQ(this));
        this.A02 = new XL(C04719o.A00(A00(322, 37, 102), c1074Xx), new XP(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(85, 45, 97), e);
                }
                A05(C04578z.A2O, e);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(str);
        anonymousClass90.A03(1);
        this.A00.A06().A8z(A00(425, 15, 107), i, anonymousClass90);
    }

    private void A05(int i, Throwable th) {
        this.A00.A06().A8y(A00(425, 15, 107), i, new AnonymousClass90(th));
    }

    public static byte[] A07(C8U c8u, String str, C0700Je c0700Je) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c0700Je.A08());
            jSONObject.put(A00(471, 4, 106), c0700Je.A06().toString());
            jSONObject.put(A00(462, 4, 86), MJ.A02(c0700Je.A04()));
            jSONObject.put(A00(450, 12, 27), MJ.A02(c0700Je.A03()));
            jSONObject.put(A00(440, 10, 116), c0700Je.A07());
            jSONObject.put(A00(419, 4, 62), new JSONObject(c0700Je.A09()));
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e) {
            if (c8u.A03().A8P()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7I();
        } catch (A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(245, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ec A[Catch: A0 -> 0x0132, TryCatch #0 {A0 -> 0x0132, blocks: (B:33:0x00e0, B:35:0x00ec, B:36:0x00fb, B:22:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00d6, B:39:0x0104, B:40:0x0108, B:42:0x010e, B:43:0x011e, B:44:0x0122, B:46:0x0128), top: B:57:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    public final int A0B(int i, Set<String> set, Set<String> set2) {
        String strA00 = A00(412, 7, 26);
        int i2 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A5M(bArr, iArr));
            List<JSONObject> listA01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC04739q) linkedList.getLast()).A9V()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A5M(bArr, iArr));
                listA01 = A01(listA01, bArr, iArr);
            }
            Iterator<JSONObject> it = listA01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(423, 2, 0));
                    try {
                        if (set.contains(string)) {
                            int i3 = next.getInt(strA00) + 1;
                            if (i3 >= i) {
                                i2++;
                            } else {
                                try {
                                    next.put(strA00, i3);
                                    this.A01.AF5(A09(next));
                                } catch (A0 e) {
                                    e = e;
                                    if (this.A00.A03().A8P()) {
                                        Log.e(A04, A00(130, 68, 107), e);
                                    }
                                    A05(C04578z.A2K, e);
                                    return i2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    try {
                                        if (this.A00.A03().A8P()) {
                                            String str = A04;
                                            String eventId = A00(198, 47, 118);
                                            Log.e(str, eventId, e);
                                        }
                                        A05(C04578z.A2O, e);
                                    } catch (A0 e3) {
                                        e = e3;
                                        if (this.A00.A03().A8P()) {
                                            Log.e(A04, A00(130, 68, 107), e);
                                        }
                                        A05(C04578z.A2K, e);
                                        return i2;
                                    }
                                }
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A03().A8P()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(A00(39, 16, 107));
                                        sb.append(string);
                                        sb.append(A00(0, 11, 2));
                                        String strA01 = A00(471, 4, 106);
                                        String eventId2 = A00(475, 7, 63);
                                        sb.append(next.optString(strA01, eventId2));
                                        sb.toString();
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (this.A00.A03().A8P()) {
                                    String str2 = A04;
                                    String eventId3 = A00(198, 47, 118);
                                    Log.e(str2, eventId3, e);
                                }
                                A05(C04578z.A2O, e);
                            }
                        }
                    } catch (A0 e5) {
                        e = e5;
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            }
            Iterator<JSONObject> it2 = listA01.iterator();
            while (it2.hasNext()) {
                this.A02.AF5(A09(it2.next()));
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC04739q) it3.next()).A4i();
            }
        } catch (A0 e8) {
            e = e8;
        }
        return i2;
    }

    public final List<JSONObject> A0C(int i) {
        boolean z = false;
        if (i == -1) {
            z = true;
            i = 30;
        }
        int[] iArr = new int[i];
        byte[] bArr = new byte[i * AdError.NETWORK_ERROR_CODE];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC04739q lastFetch = this.A01.A5M(bArr, iArr);
            linkedList2.add(lastFetch);
            int iA5N = lastFetch.A5N();
            linkedList = A01(linkedList, bArr, iArr);
            while (lastFetch.A9V() && (iA5N < i || z)) {
                if (!z) {
                    iArr = new int[i - iA5N];
                } else {
                    Arrays.fill(iArr, 0);
                }
                lastFetch = this.A01.A5M(bArr, iArr);
                linkedList2.add(lastFetch);
                linkedList = A01(linkedList, bArr, iArr);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (it.hasNext()) {
                this.A02.AF5(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC04739q) it2.next()).A4i();
            }
        } catch (A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(359, 53, 44), e);
            }
            A05(C04578z.A2L, e);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04649g
    public final void A40() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C04578z.A2I, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04649g
    public final void AFi(final C0700Je c0700Je, final AbstractC04619d<String> abstractC04619d) {
        Executor executor = MX.A07;
        final InterfaceC04749r<C0700Je> interfaceC04749r = this.A01;
        final C1074Xx c1074Xx = this.A00;
        MU.A00(executor, new AsyncTask<Void, Void, String>(c0700Je, abstractC04619d, interfaceC04749r, c1074Xx) { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};

            @Nullable
            public A0 A00;
            public final C8U A01;
            public final AbstractC04619d<String> A02;
            public final InterfaceC04749r<C0700Je> A03;
            public final C0700Je A04;

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c0700Je;
                this.A03 = interfaceC04749r;
                this.A02 = abstractC04619d;
                this.A01 = c1074Xx;
            }

            @Nullable
            private final String A01(Void... voidArr) throws Throwable {
                if (L0.A02(this)) {
                    return null;
                }
                String string = null;
                try {
                    try {
                        string = UUID.randomUUID().toString();
                        InterfaceC04568y interfaceC04568yA06 = this.A01.A06();
                        String eventId = this.A04.A06().toString();
                        interfaceC04568yA06.A8F(eventId);
                        String eventId2 = this.A04.A08();
                        if (TextUtils.isEmpty(eventId2)) {
                            return null;
                        }
                        if (this.A01.A03().A8P()) {
                            StringBuilder sb = new StringBuilder();
                            String eventId3 = A00(29, 15, 118);
                            sb.append(eventId3);
                            String eventId4 = this.A04.A06().toString();
                            sb.append(eventId4);
                            String eventId5 = A00(0, 1, 13);
                            sb.append(eventId5);
                            String eventId6 = this.A04.A09().toString();
                            sb.append(eventId6);
                            sb.toString();
                        }
                        this.A03.AF5(XO.A07(this.A01, string, this.A04));
                        return string;
                    } catch (A0 e) {
                        this.A00 = e;
                        this.A01.A06().A8y(A00(44, 15, 76), C04578z.A2M, new AnonymousClass90(e));
                    }
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) throws Throwable {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    L0.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    L0.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    L0.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
