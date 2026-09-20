package defpackage;

import com.azefsw.audioconnect.player.ui.service.PlayerService;
import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn2 implements pa3 {
    public final /* synthetic */ int w;

    public /* synthetic */ tn2(int i) {
        this.w = i;
    }

    @Override // defpackage.pa3
    public final boolean test(Object obj) {
        switch (this.w) {
            case 0:
                return ((String) obj).length() > 0;
            case 1:
                return ((Optional) obj).isPresent();
            case 2:
                return !(((y73) obj) instanceof y73.NUlFixed);
            default:
                boolean z = PlayerService.A;
                return !((w63) obj).c;
        }
    }
}
