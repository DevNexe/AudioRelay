package defpackage;

import com.azefsw.audioconnect.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l72 {
    public static final List<k72> a = ps0.M(new k72("player", p72.Player, R.string.player_title), new k72("server", p72.Server, R.string.server_title), new k72("settings", p72.Settings, R.string.settings_title));

    public static final p72 a(int i) {
        if (i >= 0) {
            List<k72> list = a;
            if (i < list.size()) {
                return list.get(i).b;
            }
        }
        return p72.Player;
    }
}
