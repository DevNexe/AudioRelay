package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgon;
import defpackage.at6;
import defpackage.pu6;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzgoj<MessageType extends zzgon<MessageType, BuilderType>, BuilderType extends zzgoj<MessageType, BuilderType>> extends zzgmn<MessageType, BuilderType> {
    public final zzgon w;
    public zzgon x;
    public boolean y = false;

    public zzgoj(MessageType messagetype) {
        this.w = messagetype;
        this.x = (zzgon) messagetype.k(4, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final /* synthetic */ zzgoj a(zzgmo zzgmoVar) {
        zzaj((zzgon) zzgmoVar);
        return this;
    }

    public final void c() {
        zzgon zzgonVar = (zzgon) this.x.k(4, null);
        pu6.c.a(zzgonVar.getClass()).b(zzgonVar, this.x);
        this.x = zzgonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgoj zzaf() {
        zzgoj zzgojVar = (zzgoj) this.w.k(5, null);
        zzgojVar.zzaj(zzan());
        return zzgojVar;
    }

    public final zzgoj zzaj(zzgon zzgonVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgon zzgonVar2 = this.x;
        pu6.c.a(zzgonVar2.getClass()).b(zzgonVar2, zzgonVar);
        return this;
    }

    public final zzgoj zzak(byte[] bArr, int i, int i2, zzgnz zzgnzVar) throws zzgoz {
        if (this.y) {
            c();
            this.y = false;
        }
        try {
            pu6.c.a(this.x.getClass()).e(this.x, bArr, 0, i2, new at6(zzgnzVar));
            return this;
        } catch (zzgoz e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgoz.f();
        }
    }

    public final MessageType zzal() {
        MessageType messagetype = (MessageType) zzan();
        if (messagetype.zzaR()) {
            return messagetype;
        }
        throw new zzgrg(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (this.y) {
            return (MessageType) this.x;
        }
        zzgon zzgonVar = this.x;
        pu6.c.a(zzgonVar.getClass()).zzf(zzgonVar);
        this.y = true;
        return (MessageType) this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final /* synthetic */ zzgpx zzbh() {
        return this.w;
    }
}
