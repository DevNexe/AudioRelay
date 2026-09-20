package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LPT4Fixed {
    public static final LPT4Fixed a = new LPT4Fixed();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
