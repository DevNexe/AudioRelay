package defpackage;

import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.internal.ads.CQf;
import com.google.android.gms.internal.ads.F1;
import com.google.android.gms.internal.ads.zzchm;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdle;
import com.google.android.gms.internal.ads.zzduw;
import com.google.android.gms.internal.ads.zzenw;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzezi;
import com.google.android.gms.internal.ads.zzfah;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqa;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzfql;
import com.google.android.gms.internal.ads.zzfqm;
import com.google.android.gms.internal.ads.zzfqn;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzxo;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class od6 implements zzfyk, kx5, zzl, zzeod, zzffs, zzfqa, dn6, zc7 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ od6(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.dn6
    public final /* synthetic */ Iterator a(zzfss zzfssVar, CharSequence charSequence) {
        return new zm6(this, zzfssVar, charSequence);
    }

    @Override // defpackage.zc7
    public final void b(zzxi zzxiVar) {
        zzxo.zzb(zzxiVar.zza, ((WindowManager) this.x).getDefaultDisplay());
    }

    @Override // defpackage.kx5
    public final void c(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.x)) {
            int i2 = (int) j;
            ((ByteBuffer) this.x).position(i2);
            ((ByteBuffer) this.x).limit(i2 + i);
            byteBufferSlice = ((ByteBuffer) this.x).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // defpackage.kx5
    public final long d() {
        return ((ByteBuffer) this.x).capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzffs
    public final zzfyx zza(zzfft zzfftVar) {
        dj6 dj6Var = (dj6) zzfftVar;
        return ((zzezi) ((zzfah) this.x)).zzb(dj6Var.b, dj6Var.a, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffs
    public final void zzb(zzffh zzffhVar) {
        zzffhVar.zza = ((zzezi) ((zzfah) this.x)).zza();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        ((zzduw) this.x).g.zzb();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        ((zzduw) this.x).g.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void zzc(zzfqp zzfqpVar, zzfqn zzfqnVar) {
        ((im6) this.x).a(zzfqpVar, zzfqnVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void zzd(zzfqk zzfqkVar, zzfqn zzfqnVar) {
        im6 im6Var = (im6) this.x;
        zzfqv zzfqvVar = im6.c;
        zzfrg zzfrgVar = im6Var.a;
        if (zzfrgVar == null) {
            zzfqvVar.zzb("error: %s", "Play Store not found.");
            return;
        }
        if (zzfqkVar.zzg() != null) {
            z05 z05Var = new z05();
            zzfrgVar.zzp(new CQf(im6Var, z05Var, zzfqkVar, zzfqnVar, z05Var), z05Var);
        } else {
            zzfqvVar.zzb("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfql zzfqlVarZzc = zzfqm.zzc();
            zzfqlVarZzc.zzb(8160);
            zzfqnVar.zza(zzfqlVarZzc.zzc());
        }
    }

    public od6(ByteBuffer byteBuffer) {
        this.w = 1;
        this.x = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void zzb(zzfpz zzfpzVar, zzfqn zzfqnVar) {
        im6 im6Var = (im6) this.x;
        zzfrg zzfrgVar = im6Var.a;
        if (zzfrgVar == null) {
            im6.c.zzb("error: %s", "Play Store not found.");
        } else {
            z05 z05Var = new z05();
            zzfrgVar.zzp(new F1(im6Var, z05Var, zzfpzVar, zzfqnVar, z05Var), z05Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeod, defpackage.zc7
    /* JADX INFO: renamed from: zza */
    public final void mo45zza() {
        switch (this.w) {
            case 4:
                synchronized (((zzenw) this.x)) {
                    ((zzenw) this.x).D = null;
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void zza(zzfqp zzfqpVar, zzfqn zzfqnVar) {
        ((im6) this.x).a(zzfqpVar, zzfqnVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        switch (this.w) {
            case 0:
                ((zzdaf) this.x).f.zzk(true);
                return;
            case 1:
            default:
                zzdle zzdleVar = (zzdle) obj;
                synchronized (((zzenw) this.x)) {
                    Object obj2 = this.x;
                    ((zzenw) obj2).D = zzdleVar;
                    ((zzenw) obj2).D.zzW();
                    break;
                }
                return;
            case 2:
                ((zzchm) this.x).b.set(1);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((zzdaf) obj).f.zzk(false);
                break;
            default:
                ((zzchm) obj).b.set(-1);
                break;
        }
    }
}
