package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 {

    @Deprecated
    public static final Pattern m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final String a;
    public final String b;
    public final String c;
    public final String f;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean l;
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();
    public final ry4 g = new ry4(new LPt8Fixed());
    public final ry4 k = new ry4(new F1());

    public static final class CQf {
        public String a;
        public final ArrayList b = new ArrayList();
    }

    public static final class F1 extends cx1 implements h81<Pattern> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final Pattern invoke() {
            String str = yk2.this.j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<Pattern> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Pattern invoke() {
            String str = yk2.this.f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public static final class QnHx {
        public String a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yk2] */
    /* JADX WARN: Type inference failed for: r14v24, types: [int] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.regex.Matcher] */
    public yk2(String str, String str2, String str3) {
        List listSingletonList;
        int i;
        List listA1;
        this.a = str;
        this.b = str2;
        this.c = str3;
        boolean z = true;
        if (str != null) {
            Uri uri = Uri.parse(str);
            boolean z2 = uri.getQuery() != null;
            this.h = z2;
            StringBuilder sb = new StringBuilder("^");
            if (!m.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (z2) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    this.l = a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.i = z;
                        queryParameter = str4;
                    }
                    ?? Matcher = patternCompile.matcher(queryParameter);
                    CQf cQf = new CQf();
                    int iEnd = 0;
                    ?? r14 = z;
                    while (Matcher.find()) {
                        String strGroup = Matcher.group(r14);
                        if (strGroup == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        cQf.b.add(strGroup);
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, Matcher.start())));
                        sb2.append("(.+?)?");
                        iEnd = Matcher.end();
                        r14 = 1;
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    cQf.a = iv4.v(sb2.toString(), ".*", "\\E.*\\Q");
                    this.e.put(str4, cQf);
                    z = true;
                }
            } else {
                this.l = a(str, sb, patternCompile);
            }
            this.f = iv4.v(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (this.c != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
                throw new IllegalArgumentException(i5.b(new StringBuilder("The given mimeType "), this.c, " does not match to required \"type/subtype\" format").toString());
            }
            String str5 = this.c;
            Pattern patternCompile2 = Pattern.compile("/");
            mv4.N(0);
            Matcher matcher2 = patternCompile2.matcher(str5);
            if (matcher2.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd2 = 0;
                do {
                    arrayList.add(str5.subSequence(iEnd2, matcher2.start()).toString());
                    iEnd2 = matcher2.end();
                } while (matcher2.find());
                arrayList.add(str5.subSequence(iEnd2, str5.length()).toString());
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(str5.toString());
            }
            if (listSingletonList.isEmpty()) {
                i = 1;
                listA1 = cs0.w;
            } else {
                ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
                while (listIterator.hasPrevious()) {
                    if (!(((String) listIterator.previous()).length() == 0)) {
                        i = 1;
                        listA1 = wu.a1(listSingletonList, listIterator.nextIndex() + 1);
                    }
                }
                i = 1;
                listA1 = cs0.w;
            }
            this.j = iv4.v("^(" + ((String) listA1.get(0)) + "|[*]+)/(" + ((String) listA1.get(i)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !mv4.y(str, ".*", false);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.d.add(strGroup);
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("([^/]+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof yk2)) {
            return false;
        }
        yk2 yk2Var = (yk2) obj;
        return ur1.a(this.a, yk2Var.a) && ur1.a(this.b, yk2Var.b) && ur1.a(this.c, yk2Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
