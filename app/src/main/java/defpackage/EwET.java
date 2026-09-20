package defpackage;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EwET implements m72 {
    @Override // defpackage.m72
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // defpackage.m72
    public j72 b(List<? extends m72> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new nb1(pb1.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // defpackage.m72
    public int c() {
        return 1073741823;
    }
}
