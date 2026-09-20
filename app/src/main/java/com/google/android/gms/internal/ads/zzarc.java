package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarc extends zzarm {
    public List D;

    public zzarc(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "aOe/514coVpPRQegN4yl3ZJgMMZH4bY8vGVrQ08DnDuyKsRCp48F+Zjpb0HjBNAa", "MvgiGujNJnCbH7w8ay+vn+9KOY0pB5PpnwUR2iVU8Do=", zzamhVar, i, 31);
        this.D = null;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        this.z.zzV(-1L);
        this.z.zzR(-1L);
        if (this.D == null) {
            this.D = (List) this.A.invoke(null, this.w.zzb());
        }
        List list = this.D;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.z) {
            this.z.zzV(((Long) this.D.get(0)).longValue());
            this.z.zzR(((Long) this.D.get(1)).longValue());
        }
    }
}
