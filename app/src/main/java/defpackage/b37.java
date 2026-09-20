package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.LPt6Fixed;
import com.google.android.gms.internal.measurement.LPt9Fixed;
import com.google.android.gms.internal.measurement.MZ;
import com.google.android.gms.internal.measurement.NUlFixed;
import com.google.android.gms.internal.measurement.SjP;
import com.google.android.gms.internal.measurement.T23;
import com.google.android.gms.internal.measurement.WE;
import com.google.android.gms.internal.measurement.Xn1;
import com.google.android.gms.internal.measurement.YKK;
import com.google.android.gms.internal.measurement.auxFixed;
import com.google.android.gms.internal.measurement.ck32;
import com.google.android.gms.internal.measurement.ct;
import com.google.android.gms.internal.measurement.qc;
import com.google.android.gms.internal.measurement.zzko;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b37 extends g27 {
    public b37(r27 r27Var) {
        super(r27Var);
    }

    public static ArrayList A(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static HashMap B(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(B((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(B((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(B((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static boolean D(b27 b27Var, int i) {
        if (i < b27Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) b27Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean F(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void H(km6 km6Var, String str, Long l) {
        List listC = km6Var.C();
        int i = 0;
        while (true) {
            if (i >= listC.size()) {
                i = -1;
                break;
            } else if (str.equals(((LPt9Fixed) listC.get(i)).x())) {
                break;
            } else {
                i++;
            }
        }
        so6 so6VarV = LPt9Fixed.v();
        so6VarV.r(str);
        if (l instanceof Long) {
            so6VarV.q(l.longValue());
        }
        if (i < 0) {
            km6Var.t(so6VarV);
            return;
        }
        if (km6Var.y) {
            km6Var.p();
            km6Var.y = false;
        }
        Xn1.A((Xn1) km6Var.x, i, (LPt9Fixed) so6VarV.n());
    }

    public static final LPt9Fixed i(Xn1 xn1, String str) {
        for (LPt9Fixed lPt9 : xn1.z()) {
            if (lPt9.x().equals(str)) {
                return lPt9;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable j(Xn1 xn1, String str) {
        LPt9Fixed lPt9I = i(xn1, str);
        if (lPt9I == null) {
            return null;
        }
        if (lPt9I.O()) {
            return lPt9I.y();
        }
        if (lPt9I.M()) {
            return Long.valueOf(lPt9I.u());
        }
        if (lPt9I.K()) {
            return Double.valueOf(lPt9I.r());
        }
        if (lPt9I.t() <= 0) {
            return null;
        }
        d27<LPt9Fixed> d27VarZ = lPt9I.z();
        ArrayList arrayList = new ArrayList();
        for (LPt9Fixed lPt9 : d27VarZ) {
            if (lPt9 != null) {
                Bundle bundle = new Bundle();
                for (LPt9Fixed lPt10 : lPt9.z()) {
                    if (lPt10.O()) {
                        bundle.putString(lPt10.x(), lPt10.y());
                    } else if (lPt10.M()) {
                        bundle.putLong(lPt10.x(), lPt10.u());
                    } else if (lPt10.K()) {
                        bundle.putDouble(lPt10.x(), lPt10.r());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void m(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final String n(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void o(StringBuilder sb, String str, WE we) {
        if (we == null) {
            return;
        }
        m(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (we.s() != 0) {
            m(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : we.B()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (we.u() != 0) {
            m(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : we.D()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (we.r() != 0) {
            m(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (LPt6Fixed lPt6 : we.A()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(lPt6.y() ? Integer.valueOf(lPt6.r()) : null);
                sb.append(":");
                sb.append(lPt6.x() ? Long.valueOf(lPt6.s()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (we.t() != 0) {
            m(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (ct ctVar : we.C()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(ctVar.z() ? Integer.valueOf(ctVar.s()) : null);
                sb.append(": [");
                Iterator it = ctVar.w().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m(3, sb);
        sb.append("}\n");
    }

    public static final void p(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void q(StringBuilder sb, int i, String str, YKK ykk) {
        String str2;
        if (ykk == null) {
            return;
        }
        m(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (ykk.x()) {
            int iC = ykk.C();
            if (iC == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iC == 2) {
                str2 = "LESS_THAN";
            } else if (iC != 3) {
                str2 = iC != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            p(sb, i, "comparison_type", str2);
        }
        if (ykk.z()) {
            p(sb, i, "match_as_float", Boolean.valueOf(ykk.w()));
        }
        if (ykk.y()) {
            p(sb, i, "comparison_value", ykk.t());
        }
        if (ykk.B()) {
            p(sb, i, "min_comparison_value", ykk.v());
        }
        if (ykk.A()) {
            p(sb, i, "max_comparison_value", ykk.u());
        }
        m(i, sb);
        sb.append("}\n");
    }

    public static int r(fr6 fr6Var, String str) {
        for (int i = 0; i < ((SjP) fr6Var.x).o1(); i++) {
            if (str.equals(((SjP) fr6Var.x).C1(i).w())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle t(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(t((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static m16 v(ds5 ds5Var) {
        Object obj;
        Bundle bundleT = t(ds5Var.c, true);
        String string = (!bundleT.containsKey("_o") || (obj = bundleT.get("_o")) == null) ? "app" : obj.toString();
        String strN = C0239D.N(ds5Var.a, v3A.A, v3A.C);
        if (strN == null) {
            strN = ds5Var.a;
        }
        return new m16(strN, new o06(bundleT), string, ds5Var.b);
    }

    public static p17 w(p17 p17Var, byte[] bArr) throws zzko {
        q07 q07VarB;
        q07 q07Var = q07.b;
        if (q07Var == null) {
            synchronized (q07.class) {
                q07VarB = q07.b;
                if (q07VarB == null) {
                    q07VarB = g17.b();
                    q07.b = q07VarB;
                }
            }
            q07Var = q07VarB;
        }
        if (q07Var != null) {
            p17Var.getClass();
            p17Var.l(bArr, bArr.length, q07Var);
            return p17Var;
        }
        p17Var.getClass();
        p17Var.l(bArr, bArr.length, q07.c);
        return p17Var;
    }

    public final void C(so6 so6Var, Object obj) {
        if (so6Var.y) {
            so6Var.p();
            so6Var.y = false;
        }
        LPt9Fixed.C((LPt9Fixed) so6Var.x);
        if (so6Var.y) {
            so6Var.p();
            so6Var.y = false;
        }
        LPt9Fixed.E((LPt9Fixed) so6Var.x);
        if (so6Var.y) {
            so6Var.p();
            so6Var.y = false;
        }
        LPt9Fixed.G((LPt9Fixed) so6Var.x);
        if (so6Var.y) {
            so6Var.p();
            so6Var.y = false;
        }
        LPt9Fixed.J((LPt9Fixed) so6Var.x);
        if (obj instanceof String) {
            so6Var.t((String) obj);
            return;
        }
        if (obj instanceof Long) {
            so6Var.q(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (so6Var.y) {
                so6Var.p();
                so6Var.y = false;
            }
            LPt9Fixed.F((LPt9Fixed) so6Var.x, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.f.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                so6 so6VarV = LPt9Fixed.v();
                for (String str : bundle.keySet()) {
                    so6 so6VarV2 = LPt9Fixed.v();
                    so6VarV2.r(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        so6VarV2.q(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        so6VarV2.t((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        if (so6VarV2.y) {
                            so6VarV2.p();
                            so6VarV2.y = false;
                        }
                        LPt9Fixed.F((LPt9Fixed) so6VarV2.x, dDoubleValue2);
                    }
                    if (so6VarV.y) {
                        so6VarV.p();
                        so6VarV.y = false;
                    }
                    LPt9Fixed.H((LPt9Fixed) so6VarV.x, (LPt9Fixed) so6VarV2.n());
                }
                if (((LPt9Fixed) so6VarV.x).t() > 0) {
                    arrayList.add((LPt9Fixed) so6VarV.n());
                }
            }
        }
        if (so6Var.y) {
            so6Var.p();
            so6Var.y = false;
        }
        LPt9Fixed.I((LPt9Fixed) so6Var.x, arrayList);
    }

    public final boolean E(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        this.a.n.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final byte[] G(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.f.c(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.g27
    public final void h() {
    }

    public final void k(StringBuilder sb, int i, d27 d27Var) {
        if (d27Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = d27Var.iterator();
        while (it.hasNext()) {
            LPt9Fixed lPt9 = (LPt9Fixed) it.next();
            if (lPt9 != null) {
                m(i2, sb);
                sb.append("param {\n");
                p(sb, i2, MediationMetaData.KEY_NAME, lPt9.N() ? this.a.m.e(lPt9.x()) : null);
                p(sb, i2, "string_value", lPt9.O() ? lPt9.y() : null);
                p(sb, i2, "int_value", lPt9.M() ? Long.valueOf(lPt9.u()) : null);
                p(sb, i2, "double_value", lPt9.K() ? Double.valueOf(lPt9.r()) : null);
                if (lPt9.t() > 0) {
                    k(sb, i2, lPt9.z());
                }
                m(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void l(StringBuilder sb, int i, NUlFixed nUl) {
        String str;
        if (nUl == null) {
            return;
        }
        m(i, sb);
        sb.append("filter {\n");
        if (nUl.y()) {
            p(sb, i, "complement", Boolean.valueOf(nUl.x()));
        }
        if (nUl.A()) {
            p(sb, i, "param_name", this.a.m.e(nUl.v()));
        }
        if (nUl.B()) {
            int i2 = i + 1;
            T23 t23U = nUl.u();
            if (t23U != null) {
                m(i2, sb);
                sb.append("string_filter {\n");
                if (t23U.z()) {
                    switch (t23U.A()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    p(sb, i2, "match_type", str);
                }
                if (t23U.y()) {
                    p(sb, i2, "expression", t23U.u());
                }
                if (t23U.x()) {
                    p(sb, i2, "case_sensitive", Boolean.valueOf(t23U.w()));
                }
                if (t23U.r() > 0) {
                    m(i2 + 1, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : t23U.v()) {
                        m(i2 + 2, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m(i2, sb);
                sb.append("}\n");
            }
        }
        if (nUl.z()) {
            q(sb, i + 1, "number_filter", nUl.t());
        }
        m(i, sb);
        sb.append("}\n");
    }

    public final long s(byte[] bArr) {
        dq6 dq6Var = this.a;
        m37 m37Var = dq6Var.l;
        dq6.f(m37Var);
        m37Var.e();
        MessageDigest messageDigestM = m37.m();
        if (messageDigestM != null) {
            return m37.f0(messageDigestM.digest(bArr));
        }
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.f.b("Failed to get MD5");
        return 0L;
    }

    public final Parcelable u(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String x(ck32 ck32Var) {
        StringBuilder sbG = Md5A.g("\nbatch {\n");
        for (SjP sjP : ck32Var.u()) {
            if (sjP != null) {
                m(1, sbG);
                sbG.append("bundle {\n");
                if (sjP.c1()) {
                    p(sbG, 1, "protocol_version", Integer.valueOf(sjP.l1()));
                }
                g87.a();
                dq6 dq6Var = this.a;
                if (dq6Var.g.n(null, lg6.p0) && sjP.f1()) {
                    p(sbG, 1, "session_stitching_token", sjP.B());
                }
                p(sbG, 1, "platform", sjP.z());
                if (sjP.Y0()) {
                    p(sbG, 1, "gmp_version", Long.valueOf(sjP.t1()));
                }
                if (sjP.j1()) {
                    p(sbG, 1, "uploading_gmp_version", Long.valueOf(sjP.y1()));
                }
                if (sjP.W0()) {
                    p(sbG, 1, "dynamite_version", Long.valueOf(sjP.r1()));
                }
                if (sjP.T0()) {
                    p(sbG, 1, "config_version", Long.valueOf(sjP.p1()));
                }
                p(sbG, 1, "gmp_app_id", sjP.w());
                p(sbG, 1, "admob_app_id", sjP.D1());
                p(sbG, 1, "app_id", sjP.E1());
                p(sbG, 1, "app_version", sjP.r());
                if (sjP.p0()) {
                    p(sbG, 1, "app_version_major", Integer.valueOf(sjP.Q()));
                }
                p(sbG, 1, "firebase_instance_id", sjP.v());
                if (sjP.V0()) {
                    p(sbG, 1, "dev_cert_hash", Long.valueOf(sjP.q1()));
                }
                p(sbG, 1, "app_store", sjP.G1());
                if (sjP.i1()) {
                    p(sbG, 1, "upload_timestamp_millis", Long.valueOf(sjP.x1()));
                }
                if (sjP.g1()) {
                    p(sbG, 1, "start_timestamp_millis", Long.valueOf(sjP.w1()));
                }
                if (sjP.X0()) {
                    p(sbG, 1, "end_timestamp_millis", Long.valueOf(sjP.s1()));
                }
                if (sjP.b1()) {
                    p(sbG, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(sjP.v1()));
                }
                if (sjP.a1()) {
                    p(sbG, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(sjP.u1()));
                }
                p(sbG, 1, "app_instance_id", sjP.F1());
                p(sbG, 1, "resettable_device_id", sjP.A());
                p(sbG, 1, "ds_id", sjP.u());
                if (sjP.Z0()) {
                    p(sbG, 1, "limited_ad_tracking", Boolean.valueOf(sjP.n0()));
                }
                p(sbG, 1, "os_version", sjP.y());
                p(sbG, 1, "device_model", sjP.t());
                p(sbG, 1, "user_default_language", sjP.C());
                if (sjP.h1()) {
                    p(sbG, 1, "time_zone_offset_minutes", Integer.valueOf(sjP.n1()));
                }
                if (sjP.q0()) {
                    p(sbG, 1, "bundle_sequential_index", Integer.valueOf(sjP.Q0()));
                }
                if (sjP.e1()) {
                    p(sbG, 1, "service_upload", Boolean.valueOf(sjP.o0()));
                }
                p(sbG, 1, "health_monitor", sjP.x());
                if (sjP.d1()) {
                    p(sbG, 1, "retry_counter", Integer.valueOf(sjP.m1()));
                }
                if (sjP.U0()) {
                    p(sbG, 1, "consent_signals", sjP.s());
                }
                d27<qc> d27VarF = sjP.F();
                lh6 lh6Var = dq6Var.m;
                if (d27VarF != null) {
                    for (qc qcVar : d27VarF) {
                        if (qcVar != null) {
                            m(2, sbG);
                            sbG.append("user_property {\n");
                            p(sbG, 2, "set_timestamp_millis", qcVar.I() ? Long.valueOf(qcVar.t()) : null);
                            p(sbG, 2, MediationMetaData.KEY_NAME, lh6Var.f(qcVar.w()));
                            p(sbG, 2, "string_value", qcVar.x());
                            p(sbG, 2, "int_value", qcVar.H() ? Long.valueOf(qcVar.s()) : null);
                            p(sbG, 2, "double_value", qcVar.G() ? Double.valueOf(qcVar.r()) : null);
                            m(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                d27<MZ> d27VarD = sjP.D();
                if (d27VarD != null) {
                    for (MZ mz : d27VarD) {
                        if (mz != null) {
                            m(2, sbG);
                            sbG.append("audience_membership {\n");
                            if (mz.B()) {
                                p(sbG, 2, "audience_id", Integer.valueOf(mz.r()));
                            }
                            if (mz.C()) {
                                p(sbG, 2, "new_audience", Boolean.valueOf(mz.A()));
                            }
                            o(sbG, "current_data", mz.u());
                            if (mz.D()) {
                                o(sbG, "previous_data", mz.v());
                            }
                            m(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                d27<Xn1> d27VarE = sjP.E();
                if (d27VarE != null) {
                    for (Xn1 xn1 : d27VarE) {
                        if (xn1 != null) {
                            m(2, sbG);
                            sbG.append("event {\n");
                            p(sbG, 2, MediationMetaData.KEY_NAME, lh6Var.d(xn1.y()));
                            if (xn1.K()) {
                                p(sbG, 2, "timestamp_millis", Long.valueOf(xn1.u()));
                            }
                            if (xn1.J()) {
                                p(sbG, 2, "previous_timestamp_millis", Long.valueOf(xn1.t()));
                            }
                            if (xn1.I()) {
                                p(sbG, 2, "count", Integer.valueOf(xn1.r()));
                            }
                            if (xn1.s() != 0) {
                                k(sbG, 2, xn1.z());
                            }
                            m(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                m(1, sbG);
                sbG.append("}\n");
            }
        }
        sbG.append("}\n");
        return sbG.toString();
    }

    public final String y(auxFixed auxVar) {
        StringBuilder sbG = Md5A.g("\nproperty_filter {\n");
        if (auxVar.A()) {
            p(sbG, 0, "filter_id", Integer.valueOf(auxVar.r()));
        }
        p(sbG, 0, "property_name", this.a.m.f(auxVar.v()));
        String strN = n(auxVar.x(), auxVar.y(), auxVar.z());
        if (!strN.isEmpty()) {
            p(sbG, 0, "filter_type", strN);
        }
        l(sbG, 1, auxVar.s());
        sbG.append("}\n");
        return sbG.toString();
    }

    public final List z(b27 b27Var, List list) {
        int i;
        ArrayList arrayList = new ArrayList(b27Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            dq6 dq6Var = this.a;
            if (iIntValue < 0) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.i.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.i.d(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }
}
