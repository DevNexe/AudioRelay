package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ye5 implements gz2 {
    public final gz2 a;

    public ye5(hz2 hz2Var) {
        this.a = hz2Var;
        boolean z = hz2Var.a;
    }

    @Override // defpackage.yu4
    public final Set<Map.Entry<String, List<String>>> a() {
        return ((bv4) Th.f(this.a)).a();
    }

    @Override // defpackage.yu4
    public final void b(String str, String str2) throws Throwable {
        this.a.b(tt.f(str, false), tt.f(str2, true));
    }

    @Override // defpackage.yu4
    public final void c(String str, Iterable<String> iterable) throws Throwable {
        String strF = tt.f(str, false);
        ArrayList arrayList = new ArrayList(mu.w0(iterable, 10));
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(tt.f(it.next(), true));
        }
        this.a.c(strF, arrayList);
    }

    @Override // defpackage.yu4
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.yu4
    public final List<String> d(String str) throws Throwable {
        List<String> listD = this.a.d(tt.f(str, false));
        if (listD == null) {
            return null;
        }
        List<String> list = listD;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tt.e((String) it.next(), 0, 0, true, 11));
        }
        return arrayList;
    }

    @Override // defpackage.yu4
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.yu4
    public final Set<String> names() {
        Set<String> setNames = this.a.names();
        ArrayList arrayList = new ArrayList(mu.w0(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(tt.e((String) it.next(), 0, 0, false, 15));
        }
        return wu.h1(arrayList);
    }
}
