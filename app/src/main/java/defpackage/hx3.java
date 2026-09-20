package defpackage;

import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hx3 {
    public static final long a;
    public static final long b;
    public static final HashMap<oe2, pe2> c;

    static {
        gq0.QnHx qnHx = gq0.x;
        kq0 kq0Var = kq0.MILLISECONDS;
        a = ps0.o0(AdError.NETWORK_ERROR_CODE, kq0Var);
        b = ps0.o0(AdError.NETWORK_ERROR_CODE, kq0Var);
        uy2[] uy2VarArr = {new uy2(oe2.QnHx.f, new pe2(R.string.server_microphone_settings_camcorder_mode_title, R.string.server_microphone_settings_camcorder_mode_description)), new uy2(oe2.NUlFixed.f, new pe2(R.string.server_microphone_settings_default_mode_title, R.string.server_microphone_settings_default_mode_description)), new uy2(oe2.YKK.f, new pe2(R.string.server_microphone_settings_mic_mode_title, R.string.server_microphone_settings_mic_mode_description)), new uy2(oe2.byN.f, new pe2(R.string.server_microphone_settings_voice_performance_mode_title, R.string.server_microphone_settings_voice_performance_mode_description)), new uy2(oe2.T23.f, new pe2(R.string.server_microphone_settings_voice_communication_mode_title, R.string.server_microphone_settings_voice_communication_mode_description)), new uy2(oe2.EQ.f, new pe2(R.string.server_microphone_settings_voice_recognition_mode_title, R.string.server_microphone_settings_voice_recognition_mode_description)), new uy2(oe2.auxFixed.f, new pe2(R.string.server_microphone_settings_unprocessed_mode_title, R.string.server_microphone_settings_unprocessed_mode_description))};
        HashMap<oe2, pe2> map = new HashMap<>(C0239D.A(7));
        t92.T(map, uy2VarArr);
        c = map;
    }
}
