package defpackage;

import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.gms.internal.ads.zzffa;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzffi;
import com.google.android.gms.internal.ads.zzffj;
import com.google.android.gms.internal.ads.zzffv;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class gk6 implements zzfey {

    @GuardedBy("this")
    public final ConcurrentHashMap a;
    public final zzfff b;
    public final ik6 c = new ik6();

    public gk6(zzfff zzfffVar) {
        this.a = new ConcurrentHashMap(zzfffVar.zzd);
        this.b = zzfffVar;
    }

    public final void a() {
        Parcelable.Creator<zzfff> creator = zzfff.CREATOR;
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzfs)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfff zzfffVar = this.b;
            sb.append(zzfffVar.zzb);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            ik6 ik6Var = this.c;
            sb2.append(ik6Var.d);
            sb2.append("\n\tNew pools created: ");
            sb2.append(ik6Var.b);
            sb2.append("\n\tPools removed: ");
            sb2.append(ik6Var.c);
            sb2.append("\n\tEntries added: ");
            sb2.append(ik6Var.f);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(ik6Var.e);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzffi) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    fk6 fk6Var = (fk6) entry.getValue();
                    fk6Var.a();
                    if (i2 >= fk6Var.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                fk6 fk6Var2 = (fk6) entry.getValue();
                fk6Var2.a();
                for (int size = fk6Var2.a.size(); size < zzfffVar.zzd; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                fk6 fk6Var3 = (fk6) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                kk6 kk6Var = fk6Var3.d;
                sb3.append(kk6Var.a);
                sb3.append(" Last accessed: ");
                sb3.append(kk6Var.c);
                sb3.append(" Accesses: ");
                sb3.append(kk6Var.d);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(kk6Var.e);
                sb3.append(" Stale: ");
                sb3.append(kk6Var.f);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < zzfffVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcgn.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final zzfff zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final synchronized zzffh zzb(zzffi zzffiVar) {
        zzffh zzffhVar;
        fk6 fk6Var = (fk6) this.a.get(zzffiVar);
        zzffhVar = null;
        if (fk6Var != null) {
            kk6 kk6Var = fk6Var.d;
            kk6Var.getClass();
            kk6Var.c = zzt.zzB().b();
            kk6Var.d++;
            fk6Var.a();
            LinkedList linkedList = fk6Var.a;
            if (!linkedList.isEmpty() && (zzffhVar = (zzffh) linkedList.remove()) != null) {
                kk6Var.e++;
                kk6Var.b.zza = true;
            }
            if (zzffhVar == null) {
                this.c.e++;
            }
            zzffv zzffvVar = fk6Var.d.b;
            zzffv zzffvVarClone = zzffvVar.clone();
            zzffvVar.zza = false;
            zzffvVar.zzb = 0;
            if (zzffhVar != null) {
                zzbfa zzbfaVarZza = zzbfg.zza();
                zzbey zzbeyVarZza = zzbez.zza();
                zzbeyVarZza.zzd(2);
                zzbfc zzbfcVarZza = zzbfd.zza();
                zzbfcVarZza.zza(zzffvVarClone.zza);
                zzbfcVarZza.zzb(zzffvVarClone.zzb);
                zzbeyVarZza.zza(zzbfcVarZza);
                zzbfaVarZza.zza(zzbeyVarZza);
                zzffhVar.zza.zzb().zzc().zze((zzbfg) zzbfaVarZza.zzal());
            }
            a();
        } else {
            this.c.d++;
            a();
        }
        return zzffhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    @Deprecated
    public final zzffi zzc(zzl zzlVar, String str, zzw zzwVar) {
        zzfff zzfffVar = this.b;
        return new zzffj(zzlVar, str, new zzcbe(zzfffVar.zza).zza().zzk, zzfffVar.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final synchronized boolean zzd(zzffi zzffiVar, zzffh zzffhVar) {
        boolean z;
        fk6 fk6Var = (fk6) this.a.get(zzffiVar);
        zzffhVar.zzd = zzt.zzB().b();
        if (fk6Var == null) {
            zzfff zzfffVar = this.b;
            fk6Var = new fk6(zzfffVar.zzd, zzfffVar.zze * AdError.NETWORK_ERROR_CODE);
            int size = this.a.size();
            zzfff zzfffVar2 = this.b;
            if (size == zzfffVar2.zzc) {
                int i = zzfffVar2.zzg;
                int i2 = i - 1;
                zzffi zzffiVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.a.entrySet()) {
                        if (((fk6) entry.getValue()).d.a < j) {
                            j = ((fk6) entry.getValue()).d.a;
                            zzffiVar2 = (zzffi) entry.getKey();
                        }
                    }
                    if (zzffiVar2 != null) {
                        this.a.remove(zzffiVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.a.entrySet()) {
                        if (((fk6) entry2.getValue()).d.c < j) {
                            j = ((fk6) entry2.getValue()).d.c;
                            zzffiVar2 = (zzffi) entry2.getKey();
                        }
                    }
                    if (zzffiVar2 != null) {
                        this.a.remove(zzffiVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.a.entrySet()) {
                        if (((fk6) entry3.getValue()).d.d < i3) {
                            i3 = ((fk6) entry3.getValue()).d.d;
                            zzffiVar2 = (zzffi) entry3.getKey();
                        }
                    }
                    if (zzffiVar2 != null) {
                        this.a.remove(zzffiVar2);
                    }
                }
                ik6 ik6Var = this.c;
                ik6Var.c++;
                ik6Var.a.zzb = true;
            }
            this.a.put(zzffiVar, fk6Var);
            ik6 ik6Var2 = this.c;
            ik6Var2.b++;
            ik6Var2.a.zza = true;
        }
        kk6 kk6Var = fk6Var.d;
        kk6Var.getClass();
        kk6Var.c = zzt.zzB().b();
        kk6Var.d++;
        fk6Var.a();
        LinkedList linkedList = fk6Var.a;
        if (linkedList.size() == fk6Var.b) {
            z = false;
        } else {
            linkedList.add(zzffhVar);
            z = true;
        }
        ik6 ik6Var3 = this.c;
        ik6Var3.f++;
        zzffa zzffaVar = ik6Var3.a;
        zzffa zzffaVarClone = zzffaVar.clone();
        zzffaVar.zza = false;
        zzffaVar.zzb = false;
        zzffv zzffvVar = fk6Var.d.b;
        zzffv zzffvVarClone = zzffvVar.clone();
        zzffvVar.zza = false;
        zzffvVar.zzb = 0;
        zzbfa zzbfaVarZza = zzbfg.zza();
        zzbey zzbeyVarZza = zzbez.zza();
        zzbeyVarZza.zzd(2);
        zzbfe zzbfeVarZza = zzbff.zza();
        zzbfeVarZza.zza(zzffaVarClone.zza);
        zzbfeVarZza.zzb(zzffaVarClone.zzb);
        zzbfeVarZza.zzc(zzffvVarClone.zzb);
        zzbeyVarZza.zzc(zzbfeVarZza);
        zzbfaVarZza.zza(zzbeyVarZza);
        zzffhVar.zza.zzb().zzc().zzf((zzbfg) zzbfaVarZza.zzal());
        a();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final synchronized boolean zze(zzffi zzffiVar) {
        fk6 fk6Var = (fk6) this.a.get(zzffiVar);
        if (fk6Var == null) {
            return true;
        }
        fk6Var.a();
        return fk6Var.a.size() < this.b.zzd;
    }
}
