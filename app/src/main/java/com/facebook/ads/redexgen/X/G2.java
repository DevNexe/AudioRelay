package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G2 extends AbstractC1359dp {
    public static byte[] A02;
    public static String[] A03 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 27;
            String[] strArr = A03;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A03[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, 127, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, 11, -4, -10, -5, -8, 11, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126};
    }

    static {
        A06();
        A04 = G2.class.getSimpleName();
    }

    public G2(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, Uri uri, Map<String, String> map, @Nullable C02520m c02520m, boolean z) {
        super(c1075Xy, interfaceC0703Jh, str, c02520m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Nullable
    private Intent A00(C02510k c02510k) {
        if (TextUtils.isEmpty(c02510k.A05())) {
            return null;
        }
        String strA03 = c02510k.A03();
        if (!M0.A04(((AbstractC02460f) this).A00, c02510k.A05()) && !A09(((AbstractC02460f) this).A00, strA03)) {
            return null;
        }
        if (!TextUtils.isEmpty(strA03) && (strA03.startsWith(A03(250, 4, 23)) || strA03.startsWith(A03(254, 10, 41)))) {
            return new Intent(A03(62, 26, 24), C0745La.A00(strA03));
        }
        PackageManager packageManager = ((AbstractC02460f) this).A00.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        if (TextUtils.isEmpty(c02510k.A04()) && TextUtils.isEmpty(strA03)) {
            return packageManager.getLaunchIntentForPackage(c02510k.A05());
        }
        Intent intentA01 = A01(c02510k);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intentA01, 65536);
        if (intentA01.getComponent() == null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[5].length() == strArr[4].length()) {
                    String[] strArr2 = A03;
                    strArr2[7] = "mdy3DwQER";
                    strArr2[1] = "z4eGZXaiq";
                    if (!zHasNext) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (next.activityInfo.packageName.equals(c02510k.A05())) {
                        intentA01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        if (listQueryIntentActivities.isEmpty() || intentA01.getComponent() == null) {
            if (!A09(((AbstractC02460f) this).A00, strA03)) {
                return null;
            }
            String strA05 = c02510k.A05();
            String[] strArr3 = A03;
            if (strArr3[5].length() != strArr3[4].length()) {
                throw new RuntimeException();
            }
            A03[2] = "8xekkGfEbM0UNtDVsVek4v0mq2iI8UOu";
            intentA01.setPackage(strA05);
        }
        return intentA01;
    }

    private Intent A01(C02510k c02510k) {
        Intent intent = new Intent(A03(88, 26, 38));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c02510k.A05()) && !TextUtils.isEmpty(c02510k.A04())) {
            intent.setComponent(new ComponentName(c02510k.A05(), c02510k.A04()));
        }
        if (!TextUtils.isEmpty(c02510k.A03())) {
            intent.setData(C0745La.A00(c02510k.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return C0745La.A00(queryParameter);
        }
        return C0745La.A00(String.format(Locale.US, A03(126, 22, 117), this.A00.getQueryParameter(A03(211, 8, 63))));
    }

    @Nullable
    private List<C02510k> A04() {
        String queryParameter = this.A00.getQueryParameter(A03(114, 12, 124));
        if (TextUtils.isEmpty(queryParameter) || A03(53, 2, 109).equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(queryParameter).optJSONArray(A03(55, 7, 127));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < i; i++) {
                    C02510k appSiteData = C02510k.A00(jSONArrayOptJSONArray.optJSONObject(i));
                    if (appSiteData != null) {
                        arrayList.add(appSiteData);
                    }
                }
            }
        } catch (JSONException e) {
            ((AbstractC02460f) this).A00.A06().A8y(A03(204, 7, 47), C04578z.A23, new AnonymousClass90(e));
            Log.w(A04, A03(0, 26, 10), e);
        }
        return arrayList;
    }

    private final List<Intent> A05() {
        List<C02510k> listA04 = A04();
        ArrayList arrayList = new ArrayList();
        if (listA04 != null) {
            Iterator<C02510k> it = listA04.iterator();
            while (it.hasNext()) {
                Intent intent = A00(it.next());
                if (intent != null) {
                    arrayList.add(intent);
                }
            }
        }
        return arrayList;
    }

    private boolean A07() {
        List<Intent> listA05 = A05();
        if (listA05 == null) {
            return false;
        }
        Iterator<Intent> it = listA05.iterator();
        while (it.hasNext()) {
            try {
                boolean result = LN.A0B(((AbstractC02460f) this).A00, it.next());
                if (result) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean A08() throws LL {
        LZ lz = new LZ();
        try {
            LZ.A0A(lz, ((AbstractC02460f) this).A00, A02(), ((AbstractC02460f) this).A02);
            return true;
        } catch (Exception unused) {
            String str = A03(26, 27, 35) + this.A00.toString();
            String queryParameter = this.A00.getQueryParameter(A03(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                LZ.A0A(lz, ((AbstractC02460f) this).A00, C0745La.A00(queryParameter), ((AbstractC02460f) this).A02);
                return false;
            }
            return false;
        }
    }

    public static boolean A09(C1075Xy c1075Xy, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean zA1Q = JR.A1Q(c1075Xy);
            if (A03[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (zA1Q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02460f
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final EnumC02450e A0A() {
        EnumC02450e enumC02450e = null;
        String strA03 = A03(148, 15, 92);
        boolean zA0F = A0F(this.A00);
        if (!zA0F) {
            zA0F = A07();
        }
        if (!zA0F) {
            try {
                strA03 = A08() ? A03(188, 16, 80) : A03(163, 25, 10);
            } catch (Exception unused) {
                enumC02450e = EnumC02450e.A02;
            }
        }
        this.A01.put(strA03, String.valueOf(true));
        return enumC02450e;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1359dp
    public final void A0D() {
        EnumC02450e enumC02450eA0A = null;
        if (((AbstractC1359dp) this).A02) {
            enumC02450eA0A = A0A();
        } else {
            this.A01.put(A03(188, 16, 80), String.valueOf(true));
        }
        Map<String, String> map = this.A01;
        if (A03[3].length() == 13) {
            throw new RuntimeException();
        }
        A03[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        A0E(map, enumC02450eA0A);
    }
}
