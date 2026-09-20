package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzeum;
import com.google.android.gms.internal.ads.zzeun;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class fi6 implements zzeun {
    public final Set a;

    public fi6(Set set) {
        this.a = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzfyo.zzi(new zzeum() { // from class: com.google.android.gms.internal.ads.zzepj
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
