package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UT {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public static class CQf {
        public final Object a;

        public CQf(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.a = collectionInfo;
        }

        public static CQf a(int i, int i2, int i3) {
            return new CQf(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
        }
    }

    public static class F1 {
        public final Object a;

        public F1(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.a = collectionItemInfo;
        }

        public static F1 a(int i, int i2, int i3, int i4, boolean z) {
            return new F1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
        }
    }

    public static class LPt8Fixed {
        public final Object a;

        public LPt8Fixed(AccessibilityNodeInfo.RangeInfo rangeInfo) {
            this.a = rangeInfo;
        }

        public static LPt8Fixed a(float f, float f2, float f3) {
            return new LPt8Fixed(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
        }
    }

    public static class QnHx {
        public static final QnHx e;
        public static final QnHx f;
        public static final QnHx g;
        public static final QnHx h;
        public static final QnHx i;
        public static final QnHx j;
        public static final QnHx k;
        public static final QnHx l;
        public static final QnHx m;
        public static final QnHx n;
        public static final QnHx o;
        public static final QnHx p;
        public final Object a;
        public final int b;
        public final Class<? extends PFC.QnHx> c;
        public final PFC d;

        static {
            new QnHx(1, (String) null);
            new QnHx(2, (String) null);
            new QnHx(4, (String) null);
            new QnHx(8, (String) null);
            e = new QnHx(16, (String) null);
            new QnHx(32, (String) null);
            f = new QnHx(64, (String) null);
            g = new QnHx(128, (String) null);
            new QnHx(256, PFC.CQf.class);
            new QnHx(AdRequest.MAX_CONTENT_URL_LENGTH, PFC.CQf.class);
            new QnHx(1024, PFC.F1.class);
            new QnHx(2048, PFC.F1.class);
            h = new QnHx(4096, (String) null);
            i = new QnHx(8192, (String) null);
            new QnHx(16384, (String) null);
            new QnHx(32768, (String) null);
            new QnHx(65536, (String) null);
            new QnHx(131072, PFC.auxFixed.class);
            j = new QnHx(262144, (String) null);
            k = new QnHx(524288, (String) null);
            l = new QnHx(1048576, (String) null);
            new QnHx(2097152, PFC.T23.class);
            int i2 = Build.VERSION.SDK_INT;
            new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, PFC.NUlFixed.class);
            m = new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            n = new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            o = new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            p = new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            new QnHx(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new QnHx(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new QnHx(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new QnHx(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new QnHx(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            new QnHx(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, PFC.YKK.class);
            new QnHx(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, PFC.LPt8Fixed.class);
            new QnHx(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new QnHx(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new QnHx(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new QnHx(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new QnHx(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new QnHx(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new QnHx(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new QnHx(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public QnHx(int i2, String str) {
            this(null, i2, str, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof QnHx)) {
                return false;
            }
            Object obj2 = ((QnHx) obj).a;
            Object obj3 = this.a;
            if (obj3 == null) {
                return obj2 == null;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public QnHx(int i2, Class cls) {
            this(null, i2, null, null, cls);
        }

        public QnHx(Object obj, int i2, String str, PFC pfc, Class cls) {
            this.b = i2;
            this.d = pfc;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    public UT(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void b(QnHx qnHx) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) qnHx.a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final int e() {
        return this.a.getMovementGranularities();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UT)) {
            return false;
        }
        UT ut = (UT) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.c == ut.c && this.b == ut.b;
    }

    public final CharSequence f() {
        boolean z = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        return z ? accessibilityNodeInfo.getStateDescription() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final CharSequence g() {
        boolean z = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (!z) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListC.size(); i++) {
            spannableString.setSpan(new vq(((Integer) arrayListC4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListC.get(i)).intValue(), ((Integer) arrayListC2.get(i)).intValue(), ((Integer) arrayListC3.get(i)).intValue());
        }
        return spannableString;
    }

    public final void h(int i, boolean z) {
        Bundle extras = this.a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(String str) {
        this.a.setClassName(str);
    }

    public final void j(CQf cQf) {
        this.a.setCollectionInfo(cQf == null ? null : (AccessibilityNodeInfo.CollectionInfo) cQf.a);
    }

    public final void k(F1 f1) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f1.a);
    }

    public final void l(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void m(LPt8Fixed lPt8) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) lPt8.a);
    }

    public final void n(CharSequence charSequence) {
        boolean z = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (z) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void o(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        ?? EmptyList;
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(zh.b() ? accessibilityNodeInfo.getUniqueId() : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                EmptyList.add(new QnHx(actionList.get(i), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < EmptyList.size(); i2++) {
            QnHx qnHx = (QnHx) EmptyList.get(i2);
            int iA = qnHx.a();
            if (iA == 1) {
                string = "ACTION_FOCUS";
            } else if (iA != 2) {
                switch (iA) {
                    case 4:
                        string = "ACTION_SELECT";
                        break;
                    case 8:
                        string = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        string = "ACTION_CLICK";
                        break;
                    case 32:
                        string = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        string = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        string = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        string = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                        string = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        string = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        string = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        string = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        string = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        string = "ACTION_COPY";
                        break;
                    case 32768:
                        string = "ACTION_PASTE";
                        break;
                    case 65536:
                        string = "ACTION_CUT";
                        break;
                    case 131072:
                        string = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        string = "ACTION_EXPAND";
                        break;
                    case 524288:
                        string = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        string = "ACTION_SET_TEXT";
                        break;
                    case R.id.accessibilityActionMoveWindow:
                        string = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (iA) {
                            case R.id.accessibilityActionShowOnScreen:
                                string = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case R.id.accessibilityActionScrollToPosition:
                                string = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case R.id.accessibilityActionScrollUp:
                                string = "ACTION_SCROLL_UP";
                                break;
                            case R.id.accessibilityActionScrollLeft:
                                string = "ACTION_SCROLL_LEFT";
                                break;
                            case R.id.accessibilityActionScrollDown:
                                string = "ACTION_SCROLL_DOWN";
                                break;
                            case R.id.accessibilityActionScrollRight:
                                string = "ACTION_SCROLL_RIGHT";
                                break;
                            case R.id.accessibilityActionContextClick:
                                string = "ACTION_CONTEXT_CLICK";
                                break;
                            case R.id.accessibilityActionSetProgress:
                                string = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (iA) {
                                    case R.id.accessibilityActionShowTooltip:
                                        string = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionHideTooltip:
                                        string = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionPageUp:
                                        string = "ACTION_PAGE_UP";
                                        break;
                                    case R.id.accessibilityActionPageDown:
                                        string = "ACTION_PAGE_DOWN";
                                        break;
                                    case R.id.accessibilityActionPageLeft:
                                        string = "ACTION_PAGE_LEFT";
                                        break;
                                    case R.id.accessibilityActionPageRight:
                                        string = "ACTION_PAGE_RIGHT";
                                        break;
                                    case R.id.accessibilityActionPressAndHold:
                                        string = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (iA) {
                                            case R.id.accessibilityActionImeEnter:
                                                string = "ACTION_IME_ENTER";
                                                break;
                                            case R.id.accessibilityActionDragStart:
                                                string = "ACTION_DRAG_START";
                                                break;
                                            case R.id.accessibilityActionDragDrop:
                                                string = "ACTION_DRAG_DROP";
                                                break;
                                            case R.id.accessibilityActionDragCancel:
                                                string = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                string = "ACTION_UNKNOWN";
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                string = "ACTION_CLEAR_FOCUS";
            }
            if (string.equals("ACTION_UNKNOWN") && qnHx.b() != null) {
                string = qnHx.b().toString();
            }
            sb.append(string);
            if (i2 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
