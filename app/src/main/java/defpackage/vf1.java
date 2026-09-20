package defpackage;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vf1 {
    public static final CQf d = new CQf();
    public static final Dt<vf1> e = new Dt<>("HttpPlainText");
    public final Charset a;
    public final Charset b;
    public final String c;

    public static final class CQf implements kf1<QnHx, vf1> {
        @Override // defpackage.kf1
        public final void a(vf1 vf1Var, ue1 ue1Var) {
            vf1 vf1Var2 = vf1Var;
            ue1Var.A.f(pg1.i, new wf1(vf1Var2, null));
            ue1Var.B.f(ug1.h, new xf1(vf1Var2, null));
        }

        @Override // defpackage.kf1
        public final vf1 b(j81<? super QnHx, sd5> j81Var) {
            QnHx qnHx = new QnHx();
            j81Var.invoke(qnHx);
            return new vf1(qnHx.a, qnHx.b, qnHx.c);
        }

        @Override // defpackage.kf1
        public final Dt<vf1> getKey() {
            return vf1.e;
        }
    }

    public static final class QnHx {
        public final LinkedHashSet a = new LinkedHashSet();
        public final LinkedHashMap b = new LinkedHashMap();
        public final Charset c = up.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vf1(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Charset charset) {
        this.a = charset;
        int size = linkedHashMap.size();
        List listSingletonList = cs0.w;
        if (size != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    arrayList.add(new uy2(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new uy2(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    listSingletonList = arrayList;
                } else {
                    listSingletonList = Collections.singletonList(new uy2(entry.getKey(), entry.getValue()));
                }
            }
        }
        List<uy2> listZ0 = wu.Z0(listSingletonList, new zf1());
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (true ^ linkedHashMap.containsKey((Charset) next)) {
                arrayList2.add(next);
            }
        }
        List listZ1 = wu.Z0(arrayList2, new yf1());
        StringBuilder sb = new StringBuilder();
        Iterator it3 = listZ1.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Charset charset2 = (Charset) it3.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            CharBuffer charBuffer = sp.a;
            sb.append(charset2.name());
        }
        for (uy2 uy2Var : listZ0) {
            Charset charset3 = (Charset) uy2Var.w;
            float fFloatValue = ((Number) uy2Var.x).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d2 = fFloatValue;
            if (!(0.0d <= d2 && d2 <= 1.0d)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            double dC = ((double) sy4.c(100 * fFloatValue)) / 100.0d;
            StringBuilder sb2 = new StringBuilder();
            CharBuffer charBuffer2 = sp.a;
            sb2.append(charset3.name());
            sb2.append(";q=");
            sb2.append(dC);
            sb.append(sb2.toString());
        }
        if (sb.length() == 0) {
            Charset charset4 = this.a;
            CharBuffer charBuffer3 = sp.a;
            sb.append(charset4.name());
        }
        this.c = sb.toString();
        Charset charset5 = (Charset) wu.J0(listZ1);
        if (charset5 == null) {
            uy2 uy2Var2 = (uy2) wu.J0(listZ0);
            charset5 = uy2Var2 != null ? (Charset) uy2Var2.w : null;
            if (charset5 == null) {
                charset5 = up.a;
            }
        }
        this.b = charset5;
    }
}
