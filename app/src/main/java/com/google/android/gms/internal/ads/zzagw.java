package com.google.android.gms.internal.ads;

import defpackage.ax5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagw implements zzaik {
    public final zzfuv a;

    public zzagw() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    public final List a(zzaij zzaijVar) {
        String str;
        int i;
        zzed zzedVar = new zzed(zzaijVar.zzd);
        ArrayList arrayList = this.a;
        while (zzedVar.zza() > 0) {
            int iZzk = zzedVar.zzk();
            int iZzc = zzedVar.zzc() + zzedVar.zzk();
            if (iZzk == 134) {
                arrayList = new ArrayList();
                int iZzk2 = zzedVar.zzk() & 31;
                for (int i2 = 0; i2 < iZzk2; i2++) {
                    String strZzx = zzedVar.zzx(3, zzfrs.zzc);
                    int iZzk3 = zzedVar.zzk();
                    int i3 = iZzk3 & 128;
                    if (i3 != 0) {
                        i = iZzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzk = (byte) zzedVar.zzk();
                    zzedVar.zzG(1);
                    List listSingletonList = i3 != 0 ? Collections.singletonList((bZzk & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    zzad zzadVar = new zzad();
                    zzadVar.zzS(str);
                    zzadVar.zzK(strZzx);
                    zzadVar.zzu(i);
                    zzadVar.zzI(listSingletonList);
                    arrayList.add(zzadVar.zzY());
                }
            }
            zzedVar.zzF(iZzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaik
    public final zzaim zza(int i, zzaij zzaijVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzahq(new zzahn(zzaijVar.zzb));
            }
            if (i == 21) {
                return new zzahq(new zzahl());
            }
            if (i == 27) {
                return new zzahq(new zzahi(new zzaia(a(zzaijVar)), false, false));
            }
            if (i == 36) {
                return new zzahq(new zzahk(new zzaia(a(zzaijVar))));
            }
            if (i == 89) {
                return new zzahq(new zzagy(zzaijVar.zzc));
            }
            if (i == 138) {
                return new zzahq(new zzagx(zzaijVar.zzb));
            }
            if (i == 172) {
                return new zzahq(new zzags(zzaijVar.zzb));
            }
            if (i == 257) {
                return new zzahz(new zzahp("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzahz(new zzahp("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzahq(new zzagv(false, zzaijVar.zzb));
                            case 16:
                                return new zzahq(new zzahe(new ax5(a(zzaijVar))));
                            case 17:
                                return new zzahq(new zzahm(zzaijVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzahq(new zzagp(zzaijVar.zzb));
            }
        }
        return new zzahq(new zzahb(new ax5(a(zzaijVar))));
    }

    public zzagw(int i) {
        this.a = zzfuv.zzo();
    }
}
