package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n27 extends s27 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.s27
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) e57.j(j, obj);
        if (list instanceof m27) {
            objUnmodifiableList = ((m27) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof u37) && (list instanceof d27)) {
                d27 d27Var = (d27) list;
                if (d27Var.zzc()) {
                    d27Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        e57.q(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.s27
    public final void b(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) e57.j(j, obj2);
        int size = list3.size();
        List list4 = (List) e57.j(j, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof m27) {
                listZzd = new l27(size);
            } else {
                listZzd = ((list4 instanceof u37) && (list4 instanceof d27)) ? ((d27) list4).zzd(size) : new ArrayList(size);
            }
            e57.q(j, obj, listZzd);
            list2 = listZzd;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                e57.q(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof q47) {
                l27 l27Var = new l27(list4.size() + size);
                l27Var.addAll(l27Var.size(), (q47) list4);
                e57.q(j, obj, l27Var);
                list = l27Var;
            } else if ((list4 instanceof u37) && (list4 instanceof d27)) {
                d27 d27Var = (d27) list4;
                if (!d27Var.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    d27 d27VarZzd = d27Var.zzd(list4.size() + size);
                    e57.q(j, obj, d27VarZzd);
                    list2 = d27VarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        e57.q(j, obj, list3);
    }
}
