package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahz implements zzaim {
    public final zzahy a;
    public final zzed b = new zzed(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public zzahz(zzahy zzahyVar) {
        this.a = zzahyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzed zzedVar, int i) {
        int iZzc;
        int i2 = i & 1;
        if (i2 != 0) {
            iZzc = zzedVar.zzc() + zzedVar.zzk();
        } else {
            iZzc = -1;
        }
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            zzedVar.zzF(iZzc);
            this.d = 0;
        }
        while (zzedVar.zza() > 0) {
            int i3 = this.d;
            zzed zzedVar2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzk = zzedVar.zzk();
                    zzedVar.zzF(zzedVar.zzc() - 1);
                    if (iZzk == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(zzedVar.zza(), 3 - this.d);
                zzedVar.zzB(zzedVar2.zzH(), this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    zzedVar2.zzF(0);
                    zzedVar2.zzE(3);
                    zzedVar2.zzG(1);
                    int iZzk2 = zzedVar2.zzk();
                    int iZzk3 = zzedVar2.zzk();
                    this.e = (iZzk2 & 128) != 0;
                    this.c = (((iZzk2 & 15) << 8) | iZzk3) + 3;
                    int iZzb = zzedVar2.zzb();
                    int i5 = this.c;
                    if (iZzb < i5) {
                        int iZzb2 = zzedVar2.zzb();
                        zzedVar2.zzz(Math.min(4098, Math.max(i5, iZzb2 + iZzb2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzedVar.zza(), this.c - i3);
                zzedVar.zzB(zzedVar2.zzH(), this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        zzedVar2.zzE(i7);
                    } else {
                        if (zzel.zzg(zzedVar2.zzH(), 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        zzedVar2.zzE(this.c - 4);
                    }
                    zzedVar2.zzF(0);
                    this.a.zza(zzedVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzej zzejVar, zzzi zzziVar, zzail zzailVar) {
        this.a.zzb(zzejVar, zzziVar, zzailVar);
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzc() {
        this.f = true;
    }
}
