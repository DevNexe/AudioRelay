package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfay;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class cl0 implements zzfax, zzsq, zzpj {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ cl0(eb6 eb6Var) {
        this.a = eb6Var;
    }

    public /* synthetic */ cl0(t07 t07Var, p07 p07Var) {
        this.d = t07Var;
        this.b = t07Var.f;
        this.c = t07Var.g;
        this.a = p07Var;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((ok4) this.b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final boolean b(int i, zzsg zzsgVar) {
        Object obj = this.a;
        zzsg zzsgVarZzc = null;
        if (zzsgVar != null) {
            p07 p07Var = (p07) obj;
            for (int i2 = 0; i2 < p07Var.c.size(); i2++) {
                if (((zzsg) p07Var.c.get(i2)).zzd == zzsgVar.zzd) {
                    zzsgVarZzc = zzsgVar.zzc(Pair.create(p07Var.b, zzsgVar.zza));
                    break;
                }
            }
            if (zzsgVarZzc == null) {
                return false;
            }
        }
        int i3 = i + ((p07) obj).d;
        zzsp zzspVar = (zzsp) this.b;
        if (zzspVar.zza != i3 || !zzel.zzT(zzspVar.zzb, zzsgVarZzc)) {
            this.b = ((t07) this.d).f.zza(i3, zzsgVarZzc, 0L);
        }
        zzpi zzpiVar = (zzpi) this.c;
        if (zzpiVar.zza == i3 && zzel.zzT(zzpiVar.zzb, zzsgVarZzc)) {
            return true;
        }
        this.c = ((t07) this.d).g.zza(i3, zzsgVarZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* synthetic */ zzfax zza(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaf(int i, zzsg zzsgVar, zzsc zzscVar) {
        if (b(i, zzsgVar)) {
            ((zzsp) this.b).zzc(zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzag(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (b(i, zzsgVar)) {
            ((zzsp) this.b).zze(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzah(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (b(i, zzsgVar)) {
            ((zzsp) this.b).zzg(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzai(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar, IOException iOException, boolean z) {
        if (b(i, zzsgVar)) {
            ((zzsp) this.b).zzi(zzrxVar, zzscVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaj(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (b(i, zzsgVar)) {
            ((zzsp) this.b).zzk(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* synthetic */ zzfax zzb(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* synthetic */ zzfax zzc(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final zzfay zzd() {
        zzguz.zzc((Context) this.b, Context.class);
        zzguz.zzc((String) this.c, String.class);
        zzguz.zzc((zzq) this.d, zzq.class);
        return new vb6((eb6) this.a, (Context) this.b, (String) this.c, (zzq) this.d);
    }

    public cl0(je4 je4Var, ad4 ad4Var) {
        this.a = je4Var;
        this.b = ad4Var;
        this.c = w9.H(cf4.CQf.a);
        this.d = new rg3();
    }

    public /* synthetic */ cl0(Context context, wc3 wc3Var, b83 b83Var, z63 z63Var) {
        this.a = context;
        this.b = wc3Var;
        this.c = b83Var;
        this.d = z63Var;
    }

    public /* synthetic */ cl0() {
        this.a = new tp1(10, 2);
        this.b = new ok4();
        this.c = new ArrayList();
        this.d = new HashSet();
    }
}
