package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.zzcf;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m37 extends sv6 {
    public static final String[] g = {"firebase_", "google_", "ga_"};
    public static final String[] h = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public Integer f;

    public m37(dq6 dq6Var) {
        super(dq6Var);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean N(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean P(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean Q(String str) {
        oa3.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean R(Context context) {
        ActivityInfo receiverInfo;
        oa3.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean S(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        oa3.h(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return (packageManager == null || (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo2.enabled) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            try {
                PackageManager packageManager2 = context.getPackageManager();
                return (packageManager2 == null || (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) == null || !serviceInfo.enabled) ? false : true;
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
    }

    public static boolean T(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            oa3.h(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] U(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final boolean V(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean Y(String str, String[] strArr) {
        oa3.h(strArr);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = strArr[i];
            if (str == obj || (str != null && str.equals(obj))) {
                return true;
            }
        }
        return false;
    }

    public static long f0(byte[] bArr) {
        oa3.h(bArr);
        int length = bArr.length;
        int i = 0;
        oa3.k(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static String l(boolean z, String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static MessageDigest m() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList o(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ft5 ft5Var = (ft5) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", ft5Var.w);
            bundle.putString("origin", ft5Var.x);
            bundle.putLong("creation_timestamp", ft5Var.z);
            bundle.putString(MediationMetaData.KEY_NAME, ft5Var.y.x);
            Object objB = ft5Var.y.b();
            oa3.h(objB);
            Th.W(bundle, objB);
            bundle.putBoolean("active", ft5Var.A);
            String str = ft5Var.B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            m16 m16Var = ft5Var.C;
            if (m16Var != null) {
                bundle.putString("timed_out_event_name", m16Var.w);
                o06 o06Var = m16Var.x;
                if (o06Var != null) {
                    bundle.putBundle("timed_out_event_params", o06Var.b());
                }
            }
            bundle.putLong("trigger_timeout", ft5Var.D);
            m16 m16Var2 = ft5Var.E;
            if (m16Var2 != null) {
                bundle.putString("triggered_event_name", m16Var2.w);
                o06 o06Var2 = m16Var2.x;
                if (o06Var2 != null) {
                    bundle.putBundle("triggered_event_params", o06Var2.b());
                }
            }
            bundle.putLong("triggered_timestamp", ft5Var.y.y);
            bundle.putLong("time_to_live", ft5Var.F);
            m16 m16Var3 = ft5Var.G;
            if (m16Var3 != null) {
                bundle.putString("expired_event_name", m16Var3.w);
                o06 o06Var3 = m16Var3.x;
                if (o06Var3 != null) {
                    bundle.putBundle("expired_event_params", o06Var3.b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void r(qy6 qy6Var, Bundle bundle, boolean z) {
        if (bundle != null && qy6Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = qy6Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = qy6Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", qy6Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && qy6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void u(k37 k37Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        V(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        k37Var.a(bundle, str);
    }

    public final void A(zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning int value to wrapper");
        }
    }

    public final void B(zzcf zzcfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning long value to wrapper");
        }
    }

    public final void C(String str, zzcf zzcfVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning string value to wrapper");
        }
    }

    public final void D(String str, String str2, Bundle bundle, List list, boolean z) {
        int iC0;
        int iH;
        if (bundle == null) {
            return;
        }
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        int i = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iC0 = !z ? c0(str3) : 0;
                if (iC0 == 0) {
                    iC0 = b0(str3);
                }
            } else {
                iC0 = 0;
            }
            if (iC0 != 0) {
                q(bundle, iC0, str3, iC0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                boolean zN = N(bundle.get(str3));
                bi6 bi6Var = dq6Var.i;
                if (zN) {
                    dq6.h(bi6Var);
                    bi6Var.k.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iH = 22;
                } else {
                    iH = H(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iH != 0 && !"_ev".equals(str3)) {
                    q(bundle, iH, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (Q(str3) && !Y(str3, NRt.D) && (i = i + 1) > 0) {
                    dq6.h(bi6Var);
                    lh6 lh6Var = dq6Var.m;
                    bi6Var.h.d(lh6Var.d(str), "Item cannot contain custom parameters", lh6Var.b(bundle));
                    V(23, bundle);
                    bundle.remove(str3);
                }
            }
        }
    }

    public final boolean E(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        dq6 dq6Var = this.a;
        if (!zIsEmpty) {
            oa3.h(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(dq6Var.b)) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.h.c(bi6.n(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(dq6Var.b)) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.h.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        oa3.h(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        bi6 bi6Var3 = dq6Var.i;
        dq6.h(bi6Var3);
        bi6Var3.h.c(bi6.n(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean F(int i, String str, String str2) {
        dq6 dq6Var = this.a;
        if (str2 == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        bi6 bi6Var2 = dq6Var.i;
        dq6.h(bi6Var2);
        bi6Var2.h.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean G(String str, String[] strArr, String[] strArr2, String str2) {
        dq6 dq6Var = this.a;
        if (str2 == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.h.d(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !Y(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Y(str2, strArr2)) {
            return true;
        }
        bi6 bi6Var3 = dq6Var.i;
        dq6.h(bi6Var3);
        bi6Var3.h.d(str, "Name is reserved. Type, name", str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    public final int H(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        e();
        boolean zN = N(obj);
        dq6 dq6Var = this.a;
        if (!zN) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!Y(str2, NRt.C)) {
                return 20;
            }
            u07 u07VarQ = dq6Var.q();
            u07VarQ.e();
            u07VarQ.f();
            if (u07VarQ.m()) {
                m37 m37Var = u07VarQ.a.l;
                dq6.f(m37Var);
                if (m37Var.e0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.k.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, RCHTTPStatusCodes.SUCCESS));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, RCHTTPStatusCodes.SUCCESS)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (P(str) || P(str2)) {
            dq6Var.getClass();
            i2 = 256;
        } else {
            dq6Var.getClass();
            i2 = 100;
        }
        if (J("param", str2, i2, obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            D(str, str2, (Bundle) obj, list, z);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.k.d(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", str2);
                    return 4;
                }
                D(str, str2, (Bundle) parcelable, list, z);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj2 = arrayList2.get(i3);
                if (!(obj2 instanceof Bundle)) {
                    bi6 bi6Var3 = dq6Var.i;
                    dq6.h(bi6Var3);
                    bi6Var3.k.d(obj2 != null ? obj2.getClass() : "null", "All ArrayList elements must be of type Bundle. Value type, name", str2);
                    return 4;
                }
                D(str, str2, (Bundle) obj2, list, z);
            }
        }
        return i;
    }

    public final void I() {
        e();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.i.b("Utils falling back to Random for random id");
            }
        }
        this.d.set(jNextLong);
    }

    public final boolean J(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.k.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean K(String str, String str2) {
        dq6 dq6Var = this.a;
        if (str2 == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                bi6 bi6Var3 = dq6Var.i;
                dq6.h(bi6Var3);
                bi6Var3.h.d(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                bi6 bi6Var4 = dq6Var.i;
                dq6.h(bi6Var4);
                bi6Var4.h.d(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean L(String str, String str2) {
        dq6 dq6Var = this.a;
        if (str2 == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            bi6Var3.h.d(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                bi6 bi6Var4 = dq6Var.i;
                dq6.h(bi6Var4);
                bi6Var4.h.d(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean M(String str) {
        e();
        dq6 dq6Var = this.a;
        if (so5.a(dq6Var.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.m.c(str, "Permission not granted");
        return false;
    }

    public final boolean O(Context context, String str) {
        Signature[] signatureArr;
        dq6 dq6Var = this.a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = so5.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.c(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.c(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final int W(String str) {
        boolean zEquals = "_ldl".equals(str);
        dq6 dq6Var = this.a;
        if (zEquals) {
            dq6Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            dq6Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            dq6Var.getClass();
            return 100;
        }
        dq6Var.getClass();
        return 36;
    }

    public final Object X(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return l(z, obj.toString(), i);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleI0 = i0((Bundle) parcelable);
                if (!bundleI0.isEmpty()) {
                    arrayList.add(bundleI0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int Z(Object obj, String str) {
        return "_ldl".equals(str) ? J("user property referrer", str, W(str), obj) : J("user property", str, W(str), obj) ? 0 : 7;
    }

    public final int a0(String str) {
        if (!K("event", str)) {
            return 2;
        }
        if (!G("event", v3A.A, v3A.B, str)) {
            return 13;
        }
        this.a.getClass();
        return !F(40, "event", str) ? 2 : 0;
    }

    public final int b0(String str) {
        if (!K("event param", str)) {
            return 3;
        }
        if (!G("event param", null, null, str)) {
            return 14;
        }
        this.a.getClass();
        return !F(40, "event param", str) ? 3 : 0;
    }

    public final int c0(String str) {
        if (!L("event param", str)) {
            return 3;
        }
        if (!G("event param", null, null, str)) {
            return 14;
        }
        this.a.getClass();
        return !F(40, "event param", str) ? 3 : 0;
    }

    public final int d0(String str) {
        if (!K("user property", str)) {
            return 6;
        }
        if (!G("user property", fXUx.B, null, str)) {
            return 15;
        }
        this.a.getClass();
        return !F(24, "user property", str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int e0() {
        if (this.f == null) {
            oa1 oa1Var = oa1.b;
            Context context = this.a.a;
            oa1Var.getClass();
            this.f = Integer.valueOf(oa1.a(context) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f.intValue();
    }

    @Override // defpackage.sv6
    public final boolean f() {
        return true;
    }

    public final long g0() {
        long andIncrement;
        long j;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long jNanoTime = System.nanoTime();
            this.a.n.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final Bundle h0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("utm_id");
                    queryParameter6 = uri.getQueryParameter("dclid");
                    queryParameter7 = uri.getQueryParameter("srsltid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("term", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("content", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("aclid", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("cp1", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("anid", queryParameter12);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("campaign_id", queryParameter5);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("dclid", queryParameter6);
                }
                String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("source_platform", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("creative_format", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("marketing_tactic", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.i.c(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final Object i(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int i = 256;
        dq6 dq6Var = this.a;
        if (zEquals) {
            dq6Var.getClass();
            return X(256, obj, true, true);
        }
        if (P(str)) {
            dq6Var.getClass();
        } else {
            dq6Var.getClass();
            i = 100;
        }
        return X(i, obj, false, true);
    }

    public final Bundle i0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objI = i(bundle.get(str), str);
                if (objI == null) {
                    dq6 dq6Var = this.a;
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.k.c(dq6Var.m.e(str), "Param value can't be null");
                } else {
                    v(bundle2, str, objI);
                }
            }
        }
        return bundle2;
    }

    public final Object j(Object obj, String str) {
        return "_ldl".equals(str) ? X(W(str), obj, true, false) : X(W(str), obj, false, false);
    }

    public final Bundle j0(String str, Bundle bundle, List list, boolean z) {
        int iC0;
        boolean zY = Y(str, v3A.D);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        dq6 dq6Var = this.a;
        int iH = dq6Var.g.h();
        int i = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iC0 = !z ? c0(str2) : 0;
                if (iC0 == 0) {
                    iC0 = b0(str2);
                }
            } else {
                iC0 = 0;
            }
            if (iC0 != 0) {
                q(bundle2, iC0, str2, iC0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iH2 = H(str, str2, bundle.get(str2), bundle2, list, z, zY);
                if (iH2 == 17) {
                    q(bundle2, 17, str2, Boolean.FALSE);
                } else if (iH2 != 0 && !"_ev".equals(str2)) {
                    q(bundle2, iH2, iH2 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (Q(str2)) {
                    int i2 = i + 1;
                    if (i2 > iH) {
                        StringBuilder sbC = iZUl.c("Event can't contain more than ", iH, " params");
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        String string = sbC.toString();
                        lh6 lh6Var = dq6Var.m;
                        bi6Var.h.d(lh6Var.d(str), string, lh6Var.b(bundle));
                        V(5, bundle2);
                        bundle2.remove(str2);
                    }
                    i = i2;
                }
            }
        }
        return bundle2;
    }

    public final String k() {
        byte[] bArr = new byte[16];
        n().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final m16 k0(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a0(str) != 0) {
            dq6 dq6Var = this.a;
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.c(dq6Var.m.f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleJ0 = j0(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleJ0 = i0(bundleJ0);
        }
        oa3.h(bundleJ0);
        return new m16(str, new o06(bundleJ0), str2, j);
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom n() {
        e();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void p(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void q(Bundle bundle, int i, String str, Object obj) {
        if (V(i, bundle)) {
            this.a.getClass();
            bundle.putString("_ev", l(true, str, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void s(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                m37 m37Var = this.a.l;
                dq6.f(m37Var);
                m37Var.v(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void t(ei6 ei6Var, int i) {
        Bundle bundle = ei6Var.d;
        int i2 = 0;
        for (String str : new TreeSet(bundle.keySet())) {
            if (Q(str) && (i2 = i2 + 1) > i) {
                StringBuilder sbC = iZUl.c("Event can't contain more than ", i, " params");
                dq6 dq6Var = this.a;
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                String string = sbC.toString();
                String str2 = ei6Var.a;
                lh6 lh6Var = dq6Var.m;
                bi6Var.h.d(lh6Var.d(str2), string, lh6Var.b(bundle));
                V(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void v(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            dq6 dq6Var = this.a;
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.k.d(dq6Var.m.e(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final void w(zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning boolean value to wrapper");
        }
    }

    public final void x(zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning bundle list to wrapper");
        }
    }

    public final void y(zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning bundle value to wrapper");
        }
    }

    public final void z(zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning byte array to wrapper");
        }
    }
}
