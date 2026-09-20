package defpackage;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f06 implements Iterable, ez5 {
    public final String w;

    public f06(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.w = str;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:103:0x017b  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:105:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01de  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0205  */
    /* JADX WARN: Code duplicated, block: B:115:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0227  */
    /* JADX WARN: Code duplicated, block: B:118:0x0257  */
    /* JADX WARN: Code duplicated, block: B:120:0x0265  */
    /* JADX WARN: Code duplicated, block: B:121:0x0276  */
    /* JADX WARN: Code duplicated, block: B:123:0x0282  */
    /* JADX WARN: Code duplicated, block: B:124:0x0287  */
    /* JADX WARN: Code duplicated, block: B:126:0x029c  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f4 A[LOOP:0: B:142:0x02f2->B:143:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0308  */
    /* JADX WARN: Code duplicated, block: B:147:0x0316  */
    /* JADX WARN: Code duplicated, block: B:148:0x032a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0336  */
    /* JADX WARN: Code duplicated, block: B:152:0x0341  */
    /* JADX WARN: Code duplicated, block: B:155:0x0352  */
    /* JADX WARN: Code duplicated, block: B:156:0x0365  */
    /* JADX WARN: Code duplicated, block: B:159:0x0374  */
    /* JADX WARN: Code duplicated, block: B:160:0x037f  */
    /* JADX WARN: Code duplicated, block: B:162:0x039b  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x040b  */
    /* JADX WARN: Code duplicated, block: B:176:0x041d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0421  */
    /* JADX WARN: Code duplicated, block: B:180:0x0463  */
    /* JADX WARN: Code duplicated, block: B:182:0x0471  */
    /* JADX WARN: Code duplicated, block: B:183:0x0474  */
    /* JADX WARN: Code duplicated, block: B:186:0x0491  */
    /* JADX WARN: Code duplicated, block: B:187:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:188:0x04af  */
    /* JADX WARN: Code duplicated, block: B:191:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:195:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:201:0x050a  */
    /* JADX WARN: Code duplicated, block: B:204:0x051b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0533  */
    /* JADX WARN: Code duplicated, block: B:210:0x055a  */
    /* JADX WARN: Code duplicated, block: B:213:0x057c  */
    /* JADX WARN: Code duplicated, block: B:221:0x059c  */
    /* JADX WARN: Code duplicated, block: B:223:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:226:0x05b2 A[LOOP:1: B:224:0x05ac->B:226:0x05b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:232:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:233:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:244:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0107  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x013f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    /* JADX WARN: Code duplicated, block: B:91:0x014a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0152  */
    /* JADX WARN: Code duplicated, block: B:95:0x0158  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0164 A[PHI: r6 r7
  0x0164: PHI (r6v48 java.lang.String) = (r6v4 java.lang.String), (r6v49 java.lang.String) binds: [B:96:0x0160, B:94:0x0155] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r7v25 java.lang.String) = (r7v1 java.lang.String), (r7v26 java.lang.String) binds: [B:96:0x0160, B:94:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:201:0x050a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        byte b;
        String strZzi;
        String str6;
        int iA;
        ez5 f06Var;
        StringBuilder sb;
        int i;
        ez5 ez5VarB;
        boolean zEquals;
        ez5 gw5Var;
        double dDoubleValue;
        int i2;
        double dDoubleValue2;
        double dA;
        String strZzi2;
        Matcher matcher;
        ez5 ez5VarD;
        String str7;
        int iIndexOf;
        Matcher matcher2;
        double dDoubleValue3;
        double dA2;
        double dMin;
        double length;
        double dA3;
        double dMin2;
        ArrayList arrayList2;
        String strZzi3;
        long jD;
        String[] strArrSplit;
        int length2;
        boolean z;
        int i3;
        int i4;
        boolean zIsEmpty;
        ma5 ma5Var2;
        int iA2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r6;
                    if (str.equals(str5)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    if (str.equals("toString")) {
                        b = 14;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b = 12;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        b = 0;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b = 1;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b = 13;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b = 7;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b = 11;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b = 4;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b = 15;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b = 16;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b = 5;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b = 8;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b = 9;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b = 10;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b = 6;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b = 3;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                    break;
            }
            strZzi = AdError.UNDEFINED_DOMAIN;
            str6 = this.w;
            switch (b) {
                case 0:
                    nw6.j(str4, 1, arrayList);
                    if (arrayList.isEmpty()) {
                        iA = 0;
                    } else {
                        iA = (int) nw6.a(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue());
                    }
                    if (iA >= 0 || iA >= str6.length()) {
                        return ez5.v;
                    }
                    f06Var = new f06(String.valueOf(str6.charAt(iA)));
                    return f06Var;
                case 1:
                    if (!arrayList.isEmpty()) {
                        sb = new StringBuilder(str6);
                        for (i = 0; i < arrayList.size(); i++) {
                            sb.append(ma5Var.b((ez5) arrayList.get(i)).zzi());
                        }
                        f06Var = new f06(sb.toString());
                        return f06Var;
                    }
                    return this;
                case 2:
                    nw6.h(str5, 1, arrayList);
                    ez5VarB = ma5Var.b((ez5) arrayList.get(0));
                    zEquals = "length".equals(ez5VarB.zzi());
                    gw5Var = ez5.t;
                    if (!zEquals) {
                        dDoubleValue = ez5VarB.zzh().doubleValue();
                        if (dDoubleValue == Math.floor(dDoubleValue) || (i2 = (int) dDoubleValue) < 0 || i2 >= str6.length()) {
                            return ez5.u;
                        }
                    }
                    return gw5Var;
                case 3:
                    nw6.j("indexOf", 2, arrayList);
                    if (arrayList.size() > 0) {
                        strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    }
                    gw5Var = new gw5(Double.valueOf(str6.indexOf(strZzi, (int) nw6.a(arrayList.size() >= 2 ? ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue() : 0.0d))));
                    return gw5Var;
                case 4:
                    nw6.j("lastIndexOf", 2, arrayList);
                    if (arrayList.size() > 0) {
                        strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    }
                    String str8 = strZzi;
                    if (arrayList.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dA = Double.POSITIVE_INFINITY;
                    } else {
                        dA = nw6.a(dDoubleValue2);
                    }
                    return new gw5(Double.valueOf(str6.lastIndexOf(str8, (int) dA)));
                case 5:
                    nw6.j("match", 1, arrayList);
                    if (arrayList.size() <= 0) {
                        strZzi2 = "";
                    } else {
                        strZzi2 = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    }
                    matcher = Pattern.compile(strZzi2).matcher(str6);
                    if (matcher.find()) {
                        return ez5.p;
                    }
                    f06Var = new hu5(Arrays.asList(new f06(matcher.group())));
                    return f06Var;
                case 6:
                    nw6.j("replace", 2, arrayList);
                    ez5VarD = ez5.o;
                    if (!arrayList.isEmpty()) {
                        strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                        if (arrayList.size() > 1) {
                            ez5VarD = ma5Var.b((ez5) arrayList.get(1));
                        }
                    }
                    str7 = strZzi;
                    iIndexOf = str6.indexOf(str7);
                    if (iIndexOf >= 0) {
                        if (ez5VarD instanceof uw5) {
                            ez5VarD = ((uw5) ez5VarD).d(ma5Var, Arrays.asList(new f06(str7), new gw5(Double.valueOf(iIndexOf)), this));
                        }
                        f06Var = new f06(LPt6Fixed.a(str6.substring(0, iIndexOf), ez5VarD.zzi(), str6.substring(str7.length() + iIndexOf)));
                        return f06Var;
                    }
                    return this;
                case 7:
                    nw6.j("search", 1, arrayList);
                    if (!arrayList.isEmpty()) {
                        strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    }
                    matcher2 = Pattern.compile(strZzi).matcher(str6);
                    if (matcher2.find()) {
                        return new gw5(Double.valueOf(-1.0d));
                    }
                    f06Var = new gw5(Double.valueOf(matcher2.start()));
                    return f06Var;
                case 8:
                    nw6.j("slice", 2, arrayList);
                    if (arrayList.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue();
                    }
                    dA2 = nw6.a(dDoubleValue3);
                    if (dA2 < 0.0d) {
                        dMin = Math.max(((double) str6.length()) + dA2, 0.0d);
                    } else {
                        dMin = Math.min(dA2, str6.length());
                    }
                    int i5 = (int) dMin;
                    if (arrayList.size() > 1) {
                        length = ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue();
                    } else {
                        length = str6.length();
                    }
                    dA3 = nw6.a(length);
                    if (dA3 < 0.0d) {
                        dMin2 = Math.max(((double) str6.length()) + dA3, 0.0d);
                    } else {
                        dMin2 = Math.min(dA3, str6.length());
                    }
                    gw5Var = new f06(str6.substring(i5, Math.max(0, ((int) dMin2) - i5) + i5));
                    return gw5Var;
                case 9:
                    nw6.j("split", 2, arrayList);
                    if (str6.length() == 0) {
                        return new hu5(Arrays.asList(this));
                    }
                    arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        strZzi3 = ma5Var.b((ez5) arrayList.get(0)).zzi();
                        if (arrayList.size() > 1) {
                            jD = nw6.d(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue());
                        } else {
                            jD = 2147483647L;
                        }
                        if (jD == 0) {
                            return new hu5();
                        }
                        strArrSplit = str6.split(Pattern.quote(strZzi3), ((int) jD) + 1);
                        length2 = strArrSplit.length;
                        if (strZzi3.isEmpty() || length2 <= 0) {
                            z = false;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i3 = length2 - 1;
                            if (!strArrSplit[i3].isEmpty()) {
                            }
                            i4 = zIsEmpty;
                            z = zIsEmpty;
                            if (length2 > jD) {
                                i3--;
                            }
                            while (i4 < i3) {
                                arrayList2.add(new f06(strArrSplit[i4]));
                                i4++;
                            }
                        }
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        if (length2 > jD) {
                            i3--;
                        }
                        while (i4 < i3) {
                            arrayList2.add(new f06(strArrSplit[i4]));
                            i4++;
                        }
                    }
                    return new hu5(arrayList2);
                case 10:
                    nw6.j("substring", 2, arrayList);
                    if (arrayList.isEmpty()) {
                        ma5Var2 = ma5Var;
                        iA2 = 0;
                    } else {
                        ma5Var2 = ma5Var;
                        iA2 = (int) nw6.a(ma5Var2.b((ez5) arrayList.get(0)).zzh().doubleValue());
                    }
                    if (arrayList.size() > 1) {
                        length3 = (int) nw6.a(ma5Var2.b((ez5) arrayList.get(1)).zzh().doubleValue());
                    } else {
                        length3 = str6.length();
                    }
                    int iMin = Math.min(Math.max(iA2, 0), str6.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str6.length());
                    gw5Var = new f06(str6.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return gw5Var;
                case 11:
                    nw6.h(str2, 0, arrayList);
                    return new f06(str6.toUpperCase());
                case 12:
                    nw6.h("toLocaleLowerCase", 0, arrayList);
                    return new f06(str6.toLowerCase());
                case 13:
                    nw6.h("toLowerCase", 0, arrayList);
                    return new f06(str6.toLowerCase(Locale.ENGLISH));
                case 14:
                    nw6.h("toString", 0, arrayList);
                    return this;
                case 15:
                    nw6.h("toUpperCase", 0, arrayList);
                    return new f06(str6.toUpperCase(Locale.ENGLISH));
                case 16:
                    nw6.h("toUpperCase", 0, arrayList);
                    return new f06(str6.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r6;
                if (str.equals(str5)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    b = 14;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b = -1;
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b = -1;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    b = 0;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 1;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b = 11;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b = 16;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b = -1;
                }
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                b = -1;
                break;
        }
        strZzi = AdError.UNDEFINED_DOMAIN;
        str6 = this.w;
        switch (b) {
            case 0:
                nw6.j(str4, 1, arrayList);
                if (arrayList.isEmpty()) {
                    iA = (int) nw6.a(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue());
                } else {
                    iA = 0;
                }
                if (iA >= 0) {
                    break;
                }
                return ez5.v;
            case 1:
                if (!arrayList.isEmpty()) {
                    sb = new StringBuilder(str6);
                    while (i < arrayList.size()) {
                        sb.append(ma5Var.b((ez5) arrayList.get(i)).zzi());
                    }
                    f06Var = new f06(sb.toString());
                    return f06Var;
                }
                return this;
            case 2:
                nw6.h(str5, 1, arrayList);
                ez5VarB = ma5Var.b((ez5) arrayList.get(0));
                zEquals = "length".equals(ez5VarB.zzi());
                gw5Var = ez5.t;
                if (!zEquals) {
                    dDoubleValue = ez5VarB.zzh().doubleValue();
                    if (dDoubleValue == Math.floor(dDoubleValue)) {
                        break;
                    }
                    return ez5.u;
                }
                return gw5Var;
            case 3:
                nw6.j("indexOf", 2, arrayList);
                if (arrayList.size() > 0) {
                    strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                }
                gw5Var = new gw5(Double.valueOf(str6.indexOf(strZzi, (int) nw6.a(arrayList.size() >= 2 ? ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue() : 0.0d))));
                return gw5Var;
            case 4:
                nw6.j("lastIndexOf", 2, arrayList);
                if (arrayList.size() > 0) {
                    strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                }
                String str9 = strZzi;
                if (arrayList.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dA = Double.POSITIVE_INFINITY;
                } else {
                    dA = nw6.a(dDoubleValue2);
                }
                return new gw5(Double.valueOf(str6.lastIndexOf(str9, (int) dA)));
            case 5:
                nw6.j("match", 1, arrayList);
                if (arrayList.size() <= 0) {
                    strZzi2 = "";
                } else {
                    strZzi2 = ma5Var.b((ez5) arrayList.get(0)).zzi();
                }
                matcher = Pattern.compile(strZzi2).matcher(str6);
                if (matcher.find()) {
                    return ez5.p;
                }
                f06Var = new hu5(Arrays.asList(new f06(matcher.group())));
                return f06Var;
            case 6:
                nw6.j("replace", 2, arrayList);
                ez5VarD = ez5.o;
                if (!arrayList.isEmpty()) {
                    strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    if (arrayList.size() > 1) {
                        ez5VarD = ma5Var.b((ez5) arrayList.get(1));
                    }
                }
                str7 = strZzi;
                iIndexOf = str6.indexOf(str7);
                if (iIndexOf >= 0) {
                    if (ez5VarD instanceof uw5) {
                        ez5VarD = ((uw5) ez5VarD).d(ma5Var, Arrays.asList(new f06(str7), new gw5(Double.valueOf(iIndexOf)), this));
                    }
                    f06Var = new f06(LPt6Fixed.a(str6.substring(0, iIndexOf), ez5VarD.zzi(), str6.substring(str7.length() + iIndexOf)));
                    return f06Var;
                }
                return this;
            case 7:
                nw6.j("search", 1, arrayList);
                if (!arrayList.isEmpty()) {
                    strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
                }
                matcher2 = Pattern.compile(strZzi).matcher(str6);
                if (matcher2.find()) {
                    return new gw5(Double.valueOf(-1.0d));
                }
                f06Var = new gw5(Double.valueOf(matcher2.start()));
                return f06Var;
            case 8:
                nw6.j("slice", 2, arrayList);
                if (arrayList.isEmpty()) {
                    dDoubleValue3 = ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dA2 = nw6.a(dDoubleValue3);
                if (dA2 < 0.0d) {
                    dMin = Math.max(((double) str6.length()) + dA2, 0.0d);
                } else {
                    dMin = Math.min(dA2, str6.length());
                }
                int i6 = (int) dMin;
                if (arrayList.size() > 1) {
                    length = ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue();
                } else {
                    length = str6.length();
                }
                dA3 = nw6.a(length);
                if (dA3 < 0.0d) {
                    dMin2 = Math.max(((double) str6.length()) + dA3, 0.0d);
                } else {
                    dMin2 = Math.min(dA3, str6.length());
                }
                gw5Var = new f06(str6.substring(i6, Math.max(0, ((int) dMin2) - i6) + i6));
                return gw5Var;
            case 9:
                nw6.j("split", 2, arrayList);
                if (str6.length() == 0) {
                    return new hu5(Arrays.asList(this));
                }
                arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    strZzi3 = ma5Var.b((ez5) arrayList.get(0)).zzi();
                    if (arrayList.size() > 1) {
                        jD = nw6.d(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue());
                    } else {
                        jD = 2147483647L;
                    }
                    if (jD == 0) {
                        return new hu5();
                    }
                    strArrSplit = str6.split(Pattern.quote(strZzi3), ((int) jD) + 1);
                    length2 = strArrSplit.length;
                    if (strZzi3.isEmpty()) {
                        z = false;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                    } else {
                        z = false;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                    }
                    i4 = zIsEmpty;
                    z = zIsEmpty;
                    if (length2 > jD) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList2.add(new f06(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new hu5(arrayList2);
            case 10:
                nw6.j("substring", 2, arrayList);
                if (arrayList.isEmpty()) {
                    ma5Var2 = ma5Var;
                    iA2 = (int) nw6.a(ma5Var2.b((ez5) arrayList.get(0)).zzh().doubleValue());
                } else {
                    ma5Var2 = ma5Var;
                    iA2 = 0;
                }
                if (arrayList.size() > 1) {
                    length3 = (int) nw6.a(ma5Var2.b((ez5) arrayList.get(1)).zzh().doubleValue());
                } else {
                    length3 = str6.length();
                }
                int iMin3 = Math.min(Math.max(iA2, 0), str6.length());
                int iMin4 = Math.min(Math.max(length3, 0), str6.length());
                gw5Var = new f06(str6.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                return gw5Var;
            case 11:
                nw6.h(str2, 0, arrayList);
                return new f06(str6.toUpperCase());
            case 12:
                nw6.h("toLocaleLowerCase", 0, arrayList);
                return new f06(str6.toLowerCase());
            case 13:
                nw6.h("toLowerCase", 0, arrayList);
                return new f06(str6.toLowerCase(Locale.ENGLISH));
            case 14:
                nw6.h("toString", 0, arrayList);
                return this;
            case 15:
                nw6.h("toUpperCase", 0, arrayList);
                return new f06(str6.toUpperCase(Locale.ENGLISH));
            case 16:
                nw6.h("toUpperCase", 0, arrayList);
                return new f06(str6.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f06) {
            return this.w.equals(((f06) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wz5(this);
    }

    public final String toString() {
        return i5.b(new StringBuilder("\""), this.w, "\"");
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return new f06(this.w);
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.valueOf(!this.w.isEmpty());
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        String str = this.w;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return this.w;
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return new uz5(this);
    }
}
