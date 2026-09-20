package com.google.android.gms.internal.ads;

import defpackage.bn6;
import defpackage.dn6;
import defpackage.fj6;
import defpackage.od6;
import defpackage.tm6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfss {
    public final tm6 a;
    public final dn6 b;

    public zzfss(dn6 dn6Var) {
        tm6 tm6Var = tm6.x;
        this.b = dn6Var;
        this.a = tm6Var;
    }

    public static zzfss zzb(int i) {
        return new zzfss(new fj6());
    }

    public static zzfss zzc(zzfrr zzfrrVar) {
        return new zzfss(new od6(zzfrrVar, 7));
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new bn6(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator itA = this.b.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
