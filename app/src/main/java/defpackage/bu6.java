package defpackage;

import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgpe;
import com.google.android.gms.internal.ads.zzgpf;
import com.google.android.gms.internal.ads.zzgrm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bu6 extends du6 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(Object obj, long j, int i) {
        List list;
        List listZzd;
        List list2 = (List) nv6.l(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof zzgpf) {
                listZzd = new zzgpe(i);
            } else {
                listZzd = ((list2 instanceof ou6) && (list2 instanceof zzgow)) ? ((zzgow) list2).zzd(i) : new ArrayList(i);
            }
            nv6.u(j, obj, listZzd);
            return listZzd;
        }
        if (c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            nv6.u(j, obj, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzgrm)) {
                if (!(list2 instanceof ou6) || !(list2 instanceof zzgow)) {
                    return list2;
                }
                zzgow zzgowVar = (zzgow) list2;
                if (zzgowVar.zzc()) {
                    return list2;
                }
                zzgow zzgowVarZzd = zzgowVar.zzd(list2.size() + i);
                nv6.u(j, obj, zzgowVarZzd);
                return zzgowVarZzd;
            }
            zzgpe zzgpeVar = new zzgpe(list2.size() + i);
            zzgpeVar.addAll(zzgpeVar.size(), (zzgrm) list2);
            nv6.u(j, obj, zzgpeVar);
            list = zzgpeVar;
        }
        return list;
    }

    @Override // defpackage.du6
    public final List a(long j, Object obj) {
        return d(obj, j, 10);
    }

    @Override // defpackage.du6
    public final void b(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) nv6.l(j, obj);
        if (list instanceof zzgpf) {
            objUnmodifiableList = ((zzgpf) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ou6) && (list instanceof zzgow)) {
                zzgow zzgowVar = (zzgow) list;
                if (zzgowVar.zzc()) {
                    zzgowVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        nv6.u(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.du6
    public final void c(long j, Object obj, Object obj2) {
        List list = (List) nv6.l(j, obj2);
        List listD = d(obj, j, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        nv6.u(j, obj, list);
    }
}
