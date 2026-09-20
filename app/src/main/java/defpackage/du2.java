package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class du2 implements mc1 {
    public final /* synthetic */ nc1 c;

    public du2(nc1 nc1Var) {
        this.c = nc1Var;
    }

    @Override // defpackage.xu4
    public final Set<Map.Entry<String, List<String>>> a() {
        nc1 nc1Var = this.c;
        nc1Var.getClass();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = nc1Var.w.length / 2;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String lowerCase = nc1Var.b(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(nc1Var.e(i));
            i = i2;
        }
        return treeMap.entrySet();
    }

    @Override // defpackage.xu4
    public final void b(x81<? super String, ? super List<String>, sd5> x81Var) {
        xu4.QnHx.a(this, x81Var);
    }

    @Override // defpackage.xu4
    public final boolean c() {
        return true;
    }

    public final List<String> d(String str) {
        List<String> listF = this.c.f(str);
        if (!listF.isEmpty()) {
            return listF;
        }
        return null;
    }

    @Override // defpackage.xu4
    public final String get(String str) {
        List<String> listD = d(str);
        if (listD != null) {
            return (String) wu.J0(listD);
        }
        return null;
    }
}
