package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfx;
import com.google.android.gms.internal.ads.zzjq;
import com.google.android.gms.internal.ads.zzkm;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzsb;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsh;
import com.google.android.gms.internal.ads.zzsi;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zztz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t07 {
    public final zzmz a;
    public final zzjq e;
    public final zzsp f;
    public final zzpi g;
    public final HashMap h;
    public final HashSet i;
    public boolean j;
    public zzfx k;
    public zztz l = new zztz(0);
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();

    public t07(zzjq zzjqVar, zzkm zzkmVar, Handler handler, zzmz zzmzVar) {
        this.a = zzmzVar;
        this.e = zzjqVar;
        zzsp zzspVar = new zzsp();
        this.f = zzspVar;
        zzpi zzpiVar = new zzpi();
        this.g = zzpiVar;
        this.h = new HashMap();
        this.i = new HashSet();
        zzspVar.zzb(handler, zzkmVar);
        zzpiVar.zzb(handler, zzkmVar);
    }

    public final zzcn a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return zzcn.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            p07 p07Var = (p07) arrayList.get(i);
            p07Var.d = iZzc;
            iZzc += p07Var.a.zzA().zzc();
        }
        return new d17(arrayList, this.l);
    }

    public final void b(zzfx zzfxVar) {
        zzdd.zzf(!this.j);
        this.k = zzfxVar;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                this.j = true;
                return;
            }
            p07 p07Var = (p07) arrayList.get(i);
            l(p07Var);
            this.i.add(p07Var);
            i++;
        }
    }

    public final void c(zzse zzseVar) {
        IdentityHashMap identityHashMap = this.c;
        p07 p07Var = (p07) identityHashMap.remove(zzseVar);
        p07Var.getClass();
        p07Var.a.zzB(zzseVar);
        p07Var.c.remove(((zzry) zzseVar).zza);
        if (!identityHashMap.isEmpty()) {
            j();
        }
        k(p07Var);
    }

    public final boolean d() {
        return this.j;
    }

    public final zzcn e(int i, List list, zztz zztzVar) {
        if (!list.isEmpty()) {
            this.l = zztzVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                p07 p07Var = (p07) list.get(i2 - i);
                ArrayList arrayList = this.b;
                if (i2 > 0) {
                    p07 p07Var2 = (p07) arrayList.get(i2 - 1);
                    p07Var.d = p07Var2.a.zzA().zzc() + p07Var2.d;
                    p07Var.e = false;
                    p07Var.c.clear();
                } else {
                    p07Var.d = 0;
                    p07Var.e = false;
                    p07Var.c.clear();
                }
                int iZzc = p07Var.a.zzA().zzc();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((p07) arrayList.get(i3)).d += iZzc;
                }
                arrayList.add(i2, p07Var);
                this.d.put(p07Var.b, p07Var);
                if (this.j) {
                    l(p07Var);
                    if (this.c.isEmpty()) {
                        this.i.add(p07Var);
                    } else {
                        n07 n07Var = (n07) this.h.get(p07Var);
                        if (n07Var != null) {
                            n07Var.a.zzi(n07Var.b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final zzcn f() {
        zzdd.zzd(this.b.size() >= 0);
        this.l = null;
        return a();
    }

    public final zzcn g(int i, int i2, zztz zztzVar) {
        zzdd.zzd(i >= 0 && i <= i2 && i2 <= this.b.size());
        this.l = zztzVar;
        m(i, i2);
        return a();
    }

    public final zzcn h(List list, zztz zztzVar) {
        ArrayList arrayList = this.b;
        m(0, arrayList.size());
        return e(arrayList.size(), list, zztzVar);
    }

    public final zzcn i(zztz zztzVar) {
        int size = this.b.size();
        if (zztzVar.zzc() != size) {
            zztzVar = zztzVar.zzf().zzg(0, size);
        }
        this.l = zztzVar;
        return a();
    }

    public final void j() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            p07 p07Var = (p07) it.next();
            if (p07Var.c.isEmpty()) {
                n07 n07Var = (n07) this.h.get(p07Var);
                if (n07Var != null) {
                    n07Var.a.zzi(n07Var.b);
                }
                it.remove();
            }
        }
    }

    public final void k(p07 p07Var) {
        if (p07Var.e && p07Var.c.isEmpty()) {
            n07 n07Var = (n07) this.h.remove(p07Var);
            n07Var.getClass();
            zzsi zzsiVar = n07Var.a;
            zzsiVar.zzp(n07Var.b);
            cl0 cl0Var = n07Var.c;
            zzsiVar.zzs(cl0Var);
            zzsiVar.zzr(cl0Var);
            this.i.remove(p07Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzjm, com.google.android.gms.internal.ads.zzsh] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(p07 p07Var) {
        zzsb zzsbVar = p07Var.a;
        ?? r1 = new zzsh() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzsh
            public final void zza(zzsi zzsiVar, zzcn zzcnVar) {
                this.zza.e.zzh();
            }
        };
        cl0 cl0Var = new cl0(this, p07Var);
        this.h.put(p07Var, new n07(zzsbVar, r1, cl0Var));
        zzsbVar.zzh(new Handler(zzel.zzE(), null), cl0Var);
        zzsbVar.zzg(new Handler(zzel.zzE(), null), cl0Var);
        zzsbVar.zzm(r1, this.k, this.a);
    }

    public final void m(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            ArrayList arrayList = this.b;
            p07 p07Var = (p07) arrayList.remove(i2);
            this.d.remove(p07Var.b);
            int i3 = -p07Var.a.zzA().zzc();
            for (int i4 = i2; i4 < arrayList.size(); i4++) {
                ((p07) arrayList.get(i4)).d += i3;
            }
            p07Var.e = true;
            if (this.j) {
                k(p07Var);
            }
        }
    }
}
