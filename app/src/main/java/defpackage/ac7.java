package defpackage;

import com.google.android.gms.common.CQf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ac7 extends sc7 {
    public final Callable e;

    public /* synthetic */ ac7(CQf cQf) {
        super(false, null, null);
        this.e = cQf;
    }

    @Override // defpackage.sc7
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
