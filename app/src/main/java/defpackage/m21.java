package defpackage;

import com.azefsw.audioconnect.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m21 implements qf6 {
    public static final vu4 A;
    public static final vu4 B;
    public static final vu4 C;
    public static final vu4 D;
    public static final vu4 E;
    public static final vu4 F;
    public static final vu4 G;
    public static final vu4 H;
    public static final vu4 I;
    public static final vu4 J;
    public static final vu4 K;
    public static final vu4 L;
    public static final vu4 M;
    public static final vu4 N;
    public static final vu4 O;
    public static final vu4 P;
    public static final vu4 Q;
    public static final vu4 R;
    public static ej1 S;
    public static ej1 T;
    public static final /* synthetic */ m21 U;
    public static ej1 w;
    public static final vu4 x;
    public static final vu4 y;
    public static final vu4 z;

    static {
        new vu4(R.string.player_settings_title);
        new vu4(R.string.generic_loading);
        new vu4(R.string.generic_dismiss_button);
        new vu4(R.string.error_card_help_title);
        new vu4(R.string.error_card_details_title);
        new vu4(R.string.go_back_icon_description);
        new vu4(R.string.player_connect_by_address_tittle);
        new vu4(R.string.player_connect_by_address_button);
        new vu4(R.string.player_connect_by_address_edit_text_label);
        x = new vu4(R.string.player_connect_by_address_edit_text_placeholder);
        new vu4(R.string.player_connect_by_address_edit_text_error);
        y = new vu4(R.string.running_stats_bytes);
        z = new vu4(R.string.running_stats_kilobytes);
        A = new vu4(R.string.running_stats_megabytes);
        B = new vu4(R.string.running_stats_gigabytes);
        C = new vu4(R.string.running_stats_seconds);
        D = new vu4(R.string.running_stats_milliseconds);
        new vu4(R.string.running_stats_not_available);
        E = new vu4(R.string.running_stat_issue_high_pack_loss);
        F = new vu4(R.string.running_stat_issue_pack_loss);
        G = new vu4(R.string.running_stat_issue_out_of_order);
        H = new vu4(R.string.running_stat_issue_high_latency);
        I = new vu4(R.string.running_stat_issue_audio_underflow);
        J = new vu4(R.string.player_connecting_state);
        new vu4(R.string.player_retrying_state);
        new vu4(R.string.player_stats_max_latency);
        new vu4(R.string.player_servers_title);
        new vu4(R.string.player_server_not_found);
        new vu4(R.string.settings_open_source_licenses_title);
        new vu4(R.string.settings_open_source_licenses_description);
        new vu4(R.string.settings_translators_title);
        new vu4(R.string.settings_translators_description);
        new vu4(R.string.icon_unknown_accessibility_description);
        new vu4(R.string.icon_windows_accessibility_description);
        new vu4(R.string.icon_linux_accessibility_description);
        new vu4(R.string.icon_mac_os_accessibility_description);
        new vu4(R.string.icon_ios_accessibility_description);
        new vu4(R.string.icon_android_accessibility_description);
        new vu4(R.string.icon_android_tv_accessibility_description);
        new vu4(R.string.accessibility_feature_requires_premium);
        new vu4(R.string.premium_feature_locked);
        new vu4(R.string.volume_boost_title);
        new vu4(R.string.volume_boost_description);
        new vu4(R.string.volume_boost_gain);
        K = new vu4(R.string.decibels);
        new vu4(R.string.mic_noise_suppression_title);
        new vu4(R.string.mic_noise_suppression_description);
        new vu4(R.string.automatic_gain_control_effect);
        new vu4(R.string.echo_cancellation_effect);
        new vu4(R.string.noise_suppression_effect);
        new vu4(R.string.not_available_effect);
        L = new vu4(R.string.mic_mode_is_required);
        M = new vu4(R.string.switch_to_mic_mode_action);
        N = new vu4(R.string.audio_effects_title);
        O = new vu4(R.string.audio_effects_description);
        P = new vu4(R.string.system_audio_effects_title);
        Q = new vu4(R.string.system_audio_effects_description);
        new vu4(R.string.copy_url_title);
        new vu4(R.string.copy_url_summary);
        R = new vu4(R.string.copy_url_editor_text_hint);
        U = new m21();
    }

    public static final ri2 a(wp1 wp1Var, g30 g30Var, int i) {
        g30Var.e(-1805515472);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = ps0.R(Boolean.FALSE);
            g30Var.B(objF);
        }
        g30Var.G();
        ri2 ri2Var = (ri2) objF;
        wq0.d(wp1Var, new l21(wp1Var, ri2Var, null), g30Var);
        g30Var.G();
        return ri2Var;
    }

    public static final ej1 b() {
        ej1 ej1Var = w;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.KeyboardArrowRight");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new uz2.YKK(8.59f, 16.59f));
        arrayList.add(new uz2.NUlFixed(13.17f, 12.0f));
        arrayList.add(new uz2.NUlFixed(8.59f, 7.41f));
        arrayList.add(new uz2.NUlFixed(10.0f, 6.0f));
        arrayList.add(new uz2.y(6.0f, 6.0f));
        arrayList.add(new uz2.y(-6.0f, 6.0f));
        arrayList.add(new uz2.y(-1.41f, -1.41f));
        arrayList.add(uz2.CQf.c);
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", arrayList);
        ej1 ej1VarD = qnHx.d();
        w = ej1VarD;
        return ej1VarD;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzg());
    }
}
