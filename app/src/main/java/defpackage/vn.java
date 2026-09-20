package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class vn implements ta5 {
    public final rt1 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final at e;
    public final at f;
    public final int g;

    public static final class CQf {
        public final int a;
        public final URL b;
        public final long c;

        public CQf(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public static final class QnHx {
        public final URL a;
        public final p9 b;
        public final String c;

        public QnHx(URL url, p9 p9Var, String str) {
            this.a = url;
            this.b = p9Var;
            this.c = str;
        }
    }

    public vn(Context context, at atVar, at atVar2) {
        st1 st1Var = new st1();
        t1.a.a(st1Var);
        st1Var.d = true;
        this.a = new rt1(st1Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = rk.c;
        try {
            this.d = new URL(str);
            this.e = atVar2;
            this.f = atVar;
            this.g = 130000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b70.a("Invalid url: ", str), e);
        }
    }

    @Override // defpackage.ta5
    public final l2 a(k2 k2Var) {
        String str;
        Object objApply;
        Integer numValueOf;
        String str2;
        u3.QnHx qnHx;
        HashMap map = new HashMap();
        for (eu0 eu0Var : k2Var.a) {
            String strG = eu0Var.g();
            if (map.containsKey(strG)) {
                ((List) map.get(strG)).add(eu0Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eu0Var);
                map.put(strG, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            eu0 eu0Var2 = (eu0) ((List) entry.getValue()).get(0);
            dh3 dh3Var = dh3.DEFAULT;
            Long lValueOf = Long.valueOf(this.f.a());
            Long lValueOf2 = Long.valueOf(this.e.a());
            o2 o2Var = new o2(gs.QnHx.ANDROID_FIREBASE, new j2(Integer.valueOf(eu0Var2.f("sdk-version")), eu0Var2.a("model"), eu0Var2.a("hardware"), eu0Var2.a("device"), eu0Var2.a("product"), eu0Var2.a("os-uild"), eu0Var2.a("manufacturer"), eu0Var2.a("fingerprint"), eu0Var2.a("locale"), eu0Var2.a("country"), eu0Var2.a("mcc_mnc"), eu0Var2.a("application_build")));
            try {
                str2 = null;
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                eu0 eu0Var3 = (eu0) it2.next();
                ks0 ks0VarD = eu0Var3.d();
                Iterator it3 = it;
                os0 os0Var = ks0VarD.a;
                Iterator it4 = it2;
                boolean zEquals = os0Var.equals(new os0("proto"));
                byte[] bArr = ks0VarD.b;
                if (zEquals) {
                    qnHx = new u3.QnHx();
                    qnHx.d = bArr;
                } else {
                    if (os0Var.equals(new os0("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        u3.QnHx qnHx2 = new u3.QnHx();
                        qnHx2.e = str3;
                        qnHx = qnHx2;
                    } else {
                        String strC = y52.c("CctTransportBackend");
                        if (Log.isLoggable(strC, 5)) {
                            Log.w(strC, String.format("Received event of unsupported encoding %s. Skipping...", os0Var));
                        }
                    }
                    it2 = it4;
                    it = it3;
                }
                qnHx.a = Long.valueOf(eu0Var3.e());
                qnHx.c = Long.valueOf(eu0Var3.h());
                String str4 = eu0Var3.b().get("tz-offset");
                qnHx.f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                qnHx.g = new x3(gn2.CQf.w.get(eu0Var3.f("net-type")), gn2.QnHx.w.get(eu0Var3.f("mobile-subtype")));
                if (eu0Var3.c() != null) {
                    qnHx.b = eu0Var3.c();
                }
                String strA = qnHx.a == null ? " eventTimeMs" : "";
                if (qnHx.c == null) {
                    strA = strA.concat(" eventUptimeMs");
                }
                if (qnHx.f == null) {
                    strA = rz.a(strA, " timezoneOffsetSeconds");
                }
                if (!strA.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strA));
                }
                arrayList3.add(new u3(qnHx.a.longValue(), qnHx.b, qnHx.c.longValue(), qnHx.d, qnHx.e, qnHx.f.longValue(), qnHx.g));
                it2 = it4;
                it = it3;
            }
            Iterator it5 = it;
            String strConcat = lValueOf == null ? " requestTimeMs" : "";
            if (lValueOf2 == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            arrayList2.add(new v3(lValueOf.longValue(), lValueOf2.longValue(), o2Var, numValueOf, str2, arrayList3, dh3Var));
            it = it5;
        }
        int i = 5;
        n2 n2Var = new n2(arrayList2);
        byte[] bArr2 = k2Var.b;
        URL url = this.d;
        if (bArr2 != null) {
            try {
                rk rkVarA = rk.a(bArr2);
                str = rkVarA.b;
                if (str == null) {
                    str = null;
                }
                String str5 = rkVarA.a;
                if (str5 != null) {
                    try {
                        url = new URL(str5);
                    } catch (MalformedURLException e) {
                        throw new IllegalArgumentException("Invalid url: " + str5, e);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                return new l2(3, -1L);
            }
        } else {
            str = null;
        }
        try {
            QnHx qnHx3 = new QnHx(url, n2Var, str);
            im3 im3Var = new im3(this, 7);
            do {
                objApply = im3Var.apply(qnHx3);
                CQf cQf = (CQf) objApply;
                URL url2 = cQf.b;
                if (url2 != null) {
                    y52.a(url2, "CctTransportBackend", "Following redirect to: %s");
                    qnHx3 = new QnHx(cQf.b, qnHx3.b, qnHx3.c);
                } else {
                    qnHx3 = null;
                }
                if (qnHx3 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            CQf cQf2 = (CQf) objApply;
            int i2 = cQf2.a;
            if (i2 == 200) {
                return new l2(1, cQf2.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? new l2(4, -1L) : new l2(3, -1L);
            }
            return new l2(2, -1L);
        } catch (IOException e2) {
            y52.b("CctTransportBackend", "Could not make request to the backend", e2);
            return new l2(2, -1L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    @Override // defpackage.ta5
    public final o3 b(eu0 eu0Var) {
        int type;
        int subtype;
        Map<String, String> map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        o3.QnHx qnHxI = eu0Var.i();
        int i = Build.VERSION.SDK_INT;
        Map<String, String> map2 = qnHxI.f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        qnHxI.a("model", Build.MODEL);
        qnHxI.a("hardware", Build.HARDWARE);
        qnHxI.a("device", Build.DEVICE);
        qnHxI.a("product", Build.PRODUCT);
        qnHxI.a("os-uild", Build.ID);
        qnHxI.a("manufacturer", Build.MANUFACTURER);
        qnHxI.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AdError.NETWORK_ERROR_CODE;
        Map<String, String> map3 = qnHxI.f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<gn2.CQf> sparseArray = gn2.CQf.w;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        Map<String, String> map4 = qnHxI.f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<gn2.QnHx> sparseArray2 = gn2.QnHx.w;
                subtype = 100;
            } else if (gn2.QnHx.w.get(subtype) == null) {
            }
            map = qnHxI.f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            qnHxI.a("country", Locale.getDefault().getCountry());
            qnHxI.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            qnHxI.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                y52.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            qnHxI.a("application_build", Integer.toString(i2));
            return qnHxI.b();
        }
        SparseArray<gn2.QnHx> sparseArray3 = gn2.QnHx.w;
        subtype = 0;
        map = qnHxI.f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        qnHxI.a("country", Locale.getDefault().getCountry());
        qnHxI.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        qnHxI.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        qnHxI.a("application_build", Integer.toString(i2));
        return qnHxI.b();
    }
}
