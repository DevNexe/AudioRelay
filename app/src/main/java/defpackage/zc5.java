package defpackage;

import io.ktor.http.URLParserException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zc5 {
    public static final xe5 k;
    public cd5 a;
    public String b;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public List<String> h;
    public gz2 i;
    public ye5 j;

    static {
        zc5 zc5Var = new zc5(null);
        if (!iv4.s("http://localhost")) {
            try {
                bd5.b(zc5Var, "http://localhost");
            } catch (Throwable th) {
                throw new URLParserException("http://localhost", th);
            }
        }
        k = zc5Var.b();
    }

    public zc5() {
        this(null);
    }

    public zc5(Object obj) throws Throwable {
        int i;
        cd5 cd5Var = cd5.c;
        cs0<String> cs0Var = cs0.w;
        fz2.b.getClass();
        this.a = cd5Var;
        this.b = "";
        this.c = 0;
        this.d = false;
        this.e = null;
        this.f = null;
        Set<Byte> set = tt.a;
        Charset charset = up.a;
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        ek ekVar = new ek(null);
        try {
            ps0.B(charsetEncoderNewEncoder, ekVar, "", 0, 0);
            tt.g(ekVar.s(), new wt(false, sb, false));
            this.g = sb.toString();
            ArrayList arrayList = new ArrayList(mu.w0(cs0Var, 10));
            for (String str : cs0Var) {
                StringBuilder sb2 = new StringBuilder();
                Charset charset2 = up.a;
                int i2 = 0;
                while (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    if (tt.b.contains(Character.valueOf(cCharAt)) || tt.e.contains(Character.valueOf(cCharAt))) {
                        sb2.append(cCharAt);
                        i2++;
                    } else {
                        if (cCharAt == '%' && (i = i2 + 2) < str.length()) {
                            int i3 = i2 + 1;
                            Character chValueOf = Character.valueOf(str.charAt(i3));
                            Set<Character> set2 = tt.c;
                            if (set2.contains(chValueOf) && set2.contains(Character.valueOf(str.charAt(i)))) {
                                sb2.append(cCharAt);
                                sb2.append(str.charAt(i3));
                                sb2.append(str.charAt(i));
                                i2 += 3;
                            }
                        }
                        int i4 = new op((char) 55296, (char) 57343).f(cCharAt) ? 2 : 1;
                        CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                        int i5 = i4 + i2;
                        ek ekVar2 = new ek(null);
                        try {
                            ps0.B(charsetEncoderNewEncoder2, ekVar2, str, i2, i5);
                            tt.g(ekVar2.s(), new vt(sb2));
                            i2 = i5;
                        } catch (Throwable th) {
                            ekVar2.close();
                            throw th;
                        }
                    }
                }
                arrayList.add(sb2.toString());
            }
            this.h = arrayList;
            hz2 hz2Var = new hz2(8);
            as0 as0Var = as0.w;
            while (as0Var.hasNext()) {
                String strF = tt.f((String) as0Var.next(), false);
                ArrayList arrayList2 = new ArrayList(mu.w0(cs0Var, 10));
                Iterator<E> it = cs0Var.iterator();
                while (it.hasNext()) {
                    arrayList2.add(tt.f((String) it.next(), true));
                }
                hz2Var.c(strF, arrayList2);
            }
            this.i = hz2Var;
            this.j = new ye5(hz2Var);
        } catch (Throwable th2) {
            ekVar.close();
            throw th2;
        }
    }

    public final void a() {
        if ((this.b.length() > 0) || ur1.a(this.a.a, "file")) {
            return;
        }
        xe5 xe5Var = k;
        this.b = xe5Var.b;
        cd5 cd5Var = this.a;
        cd5 cd5Var2 = cd5.c;
        if (ur1.a(cd5Var, cd5.c)) {
            this.a = xe5Var.a;
        }
        if (this.c == 0) {
            this.c = xe5Var.c;
        }
    }

    public final xe5 b() {
        a();
        cd5 cd5Var = this.a;
        String str = this.b;
        int i = this.c;
        List<String> list = this.h;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tt.d((String) it.next()));
        }
        fz2 fz2VarF = Th.f(this.j.a);
        tt.e(this.g, 0, 0, false, 15);
        String str2 = this.e;
        String strD = str2 != null ? tt.d(str2) : null;
        String str3 = this.f;
        return new xe5(cd5Var, str, i, arrayList, fz2VarF, strD, str3 != null ? tt.d(str3) : null, c());
    }

    public final String c() {
        List listSingletonList;
        a();
        StringBuilder sb = new StringBuilder(256);
        sb.append((CharSequence) this.a.a);
        String str = this.a.a;
        if (ur1.a(str, "file")) {
            String str2 = this.b;
            String strS = C0239D.s(this);
            sb.append((CharSequence) "://");
            sb.append((CharSequence) str2);
            if (!(strS.length() > 0 && Th.g(strS.charAt(0), '/', false))) {
                sb.append('/');
            }
            sb.append((CharSequence) strS);
        } else if (ur1.a(str, "mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.e;
            String str4 = this.f;
            if (str3 != null) {
                sb2.append(str3);
                if (str4 != null) {
                    sb2.append(':');
                    sb2.append(str4);
                }
                sb2.append("@");
            }
            String string = sb2.toString();
            String str5 = this.b;
            sb.append((CharSequence) ":");
            sb.append((CharSequence) string);
            sb.append((CharSequence) str5);
        } else {
            sb.append((CharSequence) "://");
            sb.append((CharSequence) C0239D.r(this));
            String strS2 = C0239D.s(this);
            gz2 gz2Var = this.i;
            boolean z = this.d;
            if ((!iv4.s(strS2)) && !iv4.x(strS2, "/", false)) {
                sb.append('/');
            }
            sb.append((CharSequence) strS2);
            if (!gz2Var.isEmpty() || z) {
                sb.append((CharSequence) "?");
            }
            Set<Map.Entry<String, List<String>>> setA = gz2Var.a();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setA.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str6 = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.isEmpty()) {
                    listSingletonList = Collections.singletonList(new uy2(str6, null));
                } else {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(mu.w0(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new uy2(str6, (String) it2.next()));
                    }
                    listSingletonList = arrayList2;
                }
                su.x0(listSingletonList, arrayList);
            }
            wu.L0(arrayList, sb, "&", dd5.w, 60);
            if (this.g.length() > 0) {
                sb.append('#');
                sb.append((CharSequence) this.g);
            }
        }
        return sb.toString();
    }
}
