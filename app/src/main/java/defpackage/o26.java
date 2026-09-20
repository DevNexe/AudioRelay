package defpackage;

import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzbcu;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class o26 implements Comparator {
    public final /* synthetic */ int w;

    public /* synthetic */ o26(int i) {
        this.w = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.w) {
            case 0:
                return ((zzass) obj2).zzb - ((zzass) obj).zzb;
            default:
                zzbcu zzbcuVar = (zzbcu) obj;
                zzbcu zzbcuVar2 = (zzbcu) obj2;
                int i = zzbcuVar.c - zzbcuVar2.c;
                return i != 0 ? i : (int) (zzbcuVar.a - zzbcuVar2.a);
        }
    }
}
