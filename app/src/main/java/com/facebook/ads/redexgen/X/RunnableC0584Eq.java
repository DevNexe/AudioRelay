package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0584Eq implements Runnable {
    public final /* synthetic */ RunnableC0585Er A00;
    public final /* synthetic */ DownloadAction[] A01;

    public RunnableC0584Eq(RunnableC0585Er runnableC0585Er, DownloadAction[] downloadActionArr) {
        this.A00 = runnableC0585Er;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00.A03) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.A00.A00.A0C);
            this.A00.A00.A0C.clear();
            for (DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            Iterator it = this.A00.A00.A0D.iterator();
            while (it.hasNext()) {
                ((InterfaceC0587Et) it.next()).AB0(this.A00.A00);
            }
            if (!arrayList.isEmpty()) {
                this.A00.A00.A0C.addAll(arrayList);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i = 0; i < this.A00.A00.A0C.size(); i++) {
                RunnableC0591Ex runnableC0591Ex = (RunnableC0591Ex) this.A00.A00.A0C.get(i);
                if (runnableC0591Ex.A06 == 0) {
                    this.A00.A00.A0D(runnableC0591Ex);
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
