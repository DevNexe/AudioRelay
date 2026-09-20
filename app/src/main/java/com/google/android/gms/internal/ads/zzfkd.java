package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkd extends zzfjz {
    public static final Pattern h = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final zzfkb a;
    public zzfla d;
    public final ArrayList b = new ArrayList();
    public boolean e = false;
    public boolean f = false;
    public final String g = UUID.randomUUID().toString();
    public zzflx c = new zzflx(null);

    public zzfkd(zzfka zzfkaVar, zzfkb zzfkbVar) {
        this.a = zzfkbVar;
        if (zzfkbVar.zzd() == zzfkc.HTML || zzfkbVar.zzd() == zzfkc.JAVASCRIPT) {
            this.d = new zzflb(zzfkbVar.zza());
        } else {
            this.d = new zzfld(zzfkbVar.zzi(), null);
        }
        this.d.zzj();
        zzfko.zza().zzd(this);
        zzfkt.zza().zzd(this.d.zza(), zzfkaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final void zzb(View view, zzfkf zzfkfVar, String str) {
        zzfkq zzfkqVar;
        if (this.f) {
            return;
        }
        if (!h.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                zzfkqVar = null;
                break;
            }
            zzfkqVar = (zzfkq) it.next();
        } while (zzfkqVar.zzb().get() != view);
        if (zzfkqVar == null) {
            arrayList.add(new zzfkq(view, zzfkfVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final void zzc() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.clear();
        }
        this.f = true;
        zzfkt.zza().zzc(this.d.zza());
        zzfko.zza().zze(this);
        this.d.zzc();
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final void zzd(View view) {
        if (this.f || zzf() == view) {
            return;
        }
        this.c = new zzflx(view);
        this.d.zzb();
        Collection<zzfkd> collectionZzc = zzfko.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzfkd zzfkdVar : collectionZzc) {
            if (zzfkdVar != this && zzfkdVar.zzf() == view) {
                zzfkdVar.c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final void zze() {
        if (this.e) {
            return;
        }
        this.e = true;
        zzfko.zza().zzf(this);
        this.d.zzh(zzfku.zzb().zza());
        this.d.zzf(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.c.get();
    }

    public final zzfla zzg() {
        return this.d;
    }

    public final String zzh() {
        return this.g;
    }

    public final List zzi() {
        return this.b;
    }

    public final boolean zzj() {
        return this.e && !this.f;
    }
}
