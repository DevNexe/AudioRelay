package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.zzaap;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzahy;
import com.google.android.gms.internal.ads.zzaih;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzail;
import com.google.android.gms.internal.ads.zzaim;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzfrs;
import com.google.android.gms.internal.ads.zzzi;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dw5 implements zzahy {
    public final Object A;
    public final int w;
    public final Object x;
    public final Object y;
    public final Cloneable z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dw5(zzaar zzaarVar, zzaap zzaapVar, byte[] bArr, zzaaq[] zzaaqVarArr, int i) {
        this.x = zzaarVar;
        this.y = zzaapVar;
        this.z = bArr;
        this.A = zzaaqVarArr;
        this.w = i;
    }

    public /* synthetic */ dw5(zzaih zzaihVar, int i) {
        this.A = zzaihVar;
        this.x = new zzec(new byte[5], 5);
        this.y = new SparseArray();
        this.z = new SparseIntArray();
        this.w = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zza(zzed zzedVar) {
        zzej zzejVar;
        int i;
        zzej zzejVar2;
        int i2;
        zzec zzecVar;
        if (zzedVar.zzk() != 2) {
            return;
        }
        zzaih zzaihVar = (zzaih) this.A;
        zzej zzejVar3 = (zzej) zzaihVar.a.get(0);
        if ((zzedVar.zzk() & 128) == 0) {
            return;
        }
        zzedVar.zzG(1);
        int iZzo = zzedVar.zzo();
        int i3 = 3;
        zzedVar.zzG(3);
        zzec zzecVar2 = (zzec) this.x;
        zzedVar.zzA(zzecVar2, 2);
        zzecVar2.zzj(3);
        int i4 = 13;
        zzaihVar.o = zzecVar2.zzc(13);
        zzedVar.zzA(zzecVar2, 2);
        int i5 = 4;
        zzecVar2.zzj(4);
        int i6 = 12;
        zzedVar.zzG(zzecVar2.zzc(12));
        SparseArray sparseArray = (SparseArray) this.y;
        sparseArray.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.z;
        sparseIntArray.clear();
        int iZza = zzedVar.zza();
        while (iZza > 0) {
            int i7 = 5;
            zzedVar.zzA(zzecVar2, 5);
            int iZzc = zzecVar2.zzc(8);
            zzecVar2.zzj(i3);
            int iZzc2 = zzecVar2.zzc(i4);
            zzecVar2.zzj(i5);
            int iZzc3 = zzecVar2.zzc(i6);
            int iZzc4 = zzedVar.zzc();
            int i8 = iZzc4 + iZzc3;
            String strTrim = null;
            ArrayList arrayList = null;
            int i9 = -1;
            while (zzedVar.zzc() < i8) {
                int iZzk = zzedVar.zzk();
                int iZzc5 = zzedVar.zzc() + zzedVar.zzk();
                if (iZzc5 > i8) {
                    break;
                }
                if (iZzk == i7) {
                    long jZzs = zzedVar.zzs();
                    if (jZzs == 1094921523) {
                        i9 = 129;
                    } else if (jZzs == 1161904947) {
                        i9 = 135;
                    } else if (jZzs == 1094921524) {
                        i9 = 172;
                    } else if (jZzs == 1212503619) {
                        i9 = 36;
                    }
                    zzejVar2 = zzejVar3;
                    i2 = iZzo;
                    zzecVar = zzecVar2;
                } else if (iZzk == 106) {
                    zzejVar2 = zzejVar3;
                    i2 = iZzo;
                    zzecVar = zzecVar2;
                    i9 = 129;
                } else if (iZzk == 122) {
                    zzejVar2 = zzejVar3;
                    i2 = iZzo;
                    zzecVar = zzecVar2;
                    i9 = 135;
                } else {
                    if (iZzk == 127) {
                        if (zzedVar.zzk() == 21) {
                            i9 = 172;
                        }
                    } else if (iZzk == 123) {
                        zzejVar2 = zzejVar3;
                        i2 = iZzo;
                        zzecVar = zzecVar2;
                        i9 = 138;
                    } else if (iZzk == 10) {
                        strTrim = zzedVar.zzx(3, zzfrs.zzc).trim();
                    } else if (iZzk == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (zzedVar.zzc() < iZzc5) {
                            zzec zzecVar3 = zzecVar2;
                            String strTrim2 = zzedVar.zzx(3, zzfrs.zzc).trim();
                            int iZzk2 = zzedVar.zzk();
                            zzej zzejVar4 = zzejVar3;
                            byte[] bArr = new byte[4];
                            zzedVar.zzB(bArr, 0, 4);
                            arrayList2.add(new zzaii(strTrim2, iZzk2, bArr));
                            zzejVar3 = zzejVar4;
                            zzecVar2 = zzecVar3;
                            iZzo = iZzo;
                        }
                        zzejVar2 = zzejVar3;
                        i2 = iZzo;
                        zzecVar = zzecVar2;
                        arrayList = arrayList2;
                        i9 = 89;
                    } else {
                        zzejVar2 = zzejVar3;
                        i2 = iZzo;
                        zzecVar = zzecVar2;
                        if (iZzk == 111) {
                            i9 = 257;
                        }
                    }
                    zzejVar2 = zzejVar3;
                    i2 = iZzo;
                    zzecVar = zzecVar2;
                }
                zzedVar.zzG(iZzc5 - zzedVar.zzc());
                zzejVar3 = zzejVar2;
                zzecVar2 = zzecVar;
                iZzo = i2;
                i7 = 5;
            }
            zzej zzejVar5 = zzejVar3;
            int i10 = iZzo;
            zzec zzecVar4 = zzecVar2;
            zzedVar.zzF(i8);
            zzaij zzaijVar = new zzaij(i9, strTrim, arrayList, Arrays.copyOfRange(zzedVar.zzH(), iZzc4, i8));
            if (iZzc == 6 || iZzc == 5) {
                iZzc = zzaijVar.zza;
            }
            iZza -= iZzc3 + 5;
            if (!zzaihVar.f.get(iZzc2)) {
                zzaim zzaimVarZza = zzaihVar.d.zza(iZzc, zzaijVar);
                sparseIntArray.put(iZzc2, iZzc2);
                sparseArray.put(iZzc2, zzaimVarZza);
            }
            zzejVar3 = zzejVar5;
            zzecVar2 = zzecVar4;
            iZzo = i10;
            i5 = 4;
            i3 = 3;
            i4 = 13;
            i6 = 12;
        }
        zzej zzejVar6 = zzejVar3;
        int i11 = iZzo;
        int size = sparseIntArray.size();
        int i12 = 0;
        while (i12 < size) {
            int iKeyAt = sparseIntArray.keyAt(i12);
            int iValueAt = sparseIntArray.valueAt(i12);
            zzaihVar.f.put(iKeyAt, true);
            zzaihVar.g.put(iValueAt, true);
            zzaim zzaimVar = (zzaim) sparseArray.valueAt(i12);
            if (zzaimVar != null) {
                zzzi zzziVar = zzaihVar.j;
                i = i11;
                zzail zzailVar = new zzail(i, iKeyAt, 8192);
                zzejVar = zzejVar6;
                zzaimVar.zzb(zzejVar, zzziVar, zzailVar);
                zzaihVar.e.put(iValueAt, zzaimVar);
            } else {
                zzejVar = zzejVar6;
                i = i11;
            }
            i12++;
            zzejVar6 = zzejVar;
            i11 = i;
        }
        zzaihVar.e.remove(this.w);
        zzaihVar.k = 0;
        zzaihVar.j.zzB();
        zzaihVar.l = true;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(zzej zzejVar, zzzi zzziVar, zzail zzailVar) {
    }
}
