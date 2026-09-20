package defpackage;

import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class aq6 extends xp6 {

    @CheckForNull
    public List L;

    public aq6(zzfuv zzfuvVar) {
        super(zzfuvVar, true, true);
        List listEmptyList = zzfuvVar.isEmpty() ? Collections.emptyList() : zzfvj.zza(zzfuvVar.size());
        for (int i = 0; i < zzfuvVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.L = listEmptyList;
        s();
    }

    @Override // defpackage.xp6
    public final void q(int i, Object obj) {
        List list = this.L;
        if (list != null) {
            list.set(i, new bq6(obj));
        }
    }

    @Override // defpackage.xp6
    public final void r() {
        List<bq6> list = this.L;
        if (list != null) {
            ArrayList arrayListZza = zzfvj.zza(list.size());
            for (bq6 bq6Var : list) {
                arrayListZza.add(bq6Var != null ? bq6Var.a : null);
            }
            zzd(Collections.unmodifiableList(arrayListZza));
        }
    }

    @Override // defpackage.xp6
    public final void t(int i) {
        this.H = null;
        this.L = null;
    }
}
