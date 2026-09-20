package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.Md5A;
import defpackage.bi5;
import defpackage.g85;
import defpackage.t85;
import defpackage.vw4;
import defpackage.wc0;
import defpackage.wjL;
import defpackage.xApe;
import defpackage.yj5;
import defpackage.yt;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.CQf implements yt {
    public static final MZ C0;
    public final F1 A0;
    public final WeakHashMap<String, Drawable.ConstantState> B0;
    public final SearchAutoComplete L;
    public final View M;
    public final View N;
    public final View O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public final View T;
    public Xn1 U;
    public final Rect V;
    public final Rect W;
    public final int[] a0;
    public final int[] b0;
    public final ImageView c0;
    public final Drawable d0;
    public final int e0;
    public final int f0;
    public final Intent g0;
    public final Intent h0;
    public final CharSequence i0;
    public View.OnFocusChangeListener j0;
    public View.OnClickListener k0;
    public boolean l0;
    public boolean m0;
    public wc0 n0;
    public boolean o0;
    public CharSequence p0;
    public boolean q0;
    public boolean r0;
    public int s0;
    public boolean t0;
    public CharSequence u0;
    public boolean v0;
    public int w0;
    public SearchableInfo x0;
    public Bundle y0;
    public final CQf z0;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.r();
        }
    }

    public class EQ implements AdapterView.OnItemSelectedListener {
        public EQ() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.n(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class F1 implements Runnable {
        public F1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wc0 wc0Var = SearchView.this.n0;
            if (wc0Var instanceof vw4) {
                wc0Var.b(null);
            }
        }
    }

    public static class FJCM {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public static class LPt6Fixed extends defpackage.CQf {
        public static final Parcelable.Creator<LPt6Fixed> CREATOR = new QnHx();
        public boolean y;

        public class QnHx implements Parcelable.ClassLoaderCreator<LPt6Fixed> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final LPt6Fixed createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new LPt6Fixed(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LPt6Fixed[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new LPt6Fixed(parcel, null);
            }
        }

        public LPt6Fixed(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return Md5A.f(sb, this.y, "}");
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeValue(Boolean.valueOf(this.y));
        }

        public LPt6Fixed(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public class LPt8Fixed implements View.OnFocusChangeListener {
        public LPt8Fixed() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.j0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public static class MZ {
        public final Method a;
        public final Method b;
        public final Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public MZ() {
            this.a = null;
            this.b = null;
            this.c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public class NUlFixed implements View.OnLayoutChangeListener {
        public NUlFixed() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            View view2 = searchView.T;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.N.getPaddingLeft();
                Rect rect = new Rect();
                boolean zA = yj5.a(searchView);
                if (searchView.l0) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.L;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public interface PRnFixed {
    }

    public class QnHx implements TextWatcher {
        public QnHx() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.L.getText();
            searchView.u0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.u(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.t0 && !searchView.m0 && z2) {
                searchView.Q.setVisibility(8);
                i4 = 0;
            }
            searchView.S.setVisibility(i4);
            searchView.q();
            searchView.t();
            charSequence.toString();
            searchView.getClass();
        }
    }

    public interface RBi {
    }

    public static class SearchAutoComplete extends wjL {
        public int A;
        public SearchView B;
        public boolean C;
        public final QnHx D;

        public class QnHx implements Runnable {
            public QnHx() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.C) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.C = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.D = new QnHx();
            this.A = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                FJCM.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            MZ mz = SearchView.C0;
            mz.getClass();
            MZ.a();
            Method method = mz.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.A <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.wjL, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.C) {
                QnHx qnHx = this.D;
                removeCallbacks(qnHx);
                post(qnHx);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.B;
            searchView.v(searchView.m0);
            searchView.post(searchView.z0);
            if (searchView.L.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.B.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.B.hasFocus() && getVisibility() == 0) {
                this.C = true;
                Context context = getContext();
                MZ mz = SearchView.C0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            QnHx qnHx = this.D;
            if (!z) {
                this.C = false;
                removeCallbacks(qnHx);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.C = true;
                    return;
                }
                this.C = false;
                removeCallbacks(qnHx);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.B = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A = i;
        }
    }

    public class T23 implements TextView.OnEditorActionListener {
        public T23() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.p();
            return true;
        }
    }

    public static class Xn1 extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public Xn1(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.a = searchAutoComplete;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    this.f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.c;
            View view = this.a;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    public class YKK implements View.OnClickListener {
        public YKK() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.P;
            SearchAutoComplete searchAutoComplete = searchView.L;
            if (view == imageView) {
                searchView.v(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.k0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.R) {
                searchView.l();
                return;
            }
            if (view == searchView.Q) {
                searchView.p();
                return;
            }
            if (view != searchView.S) {
                if (view == searchAutoComplete) {
                    searchView.k();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.x0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.j(searchView.h0, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.g0);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class auxFixed implements View.OnKeyListener {
        public auxFixed() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.x0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.L;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.x0 == null || searchView.n0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                searchView.m(searchAutoComplete.getListSelection());
            } else {
                if (i != 21 && i != 22) {
                    if (i != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            }
            return true;
        }
    }

    public class byN implements AdapterView.OnItemClickListener {
        public byN() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m(i);
        }
    }

    public interface y {
    }

    static {
        C0 = Build.VERSION.SDK_INT < 29 ? new MZ() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.r0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.r0 = false;
    }

    public int getImeOptions() {
        return this.L.getImeOptions();
    }

    public int getInputType() {
        return this.L.getInputType();
    }

    public int getMaxWidth() {
        return this.s0;
    }

    public CharSequence getQuery() {
        return this.L.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.p0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.x0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.i0 : getContext().getText(this.x0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f0;
    }

    public int getSuggestionRowLayout() {
        return this.e0;
    }

    public wc0 getSuggestionsAdapter() {
        return this.n0;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.u0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.x0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.y0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.L;
        if (i >= 29) {
            FJCM.a(searchAutoComplete);
            return;
        }
        MZ mz = C0;
        mz.getClass();
        MZ.a();
        Method method = mz.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        mz.getClass();
        MZ.a();
        Method method2 = mz.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.L;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.l0) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i) {
        int position;
        String strH;
        Cursor cursor = this.n0.y;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentI = null;
            try {
                int i2 = vw4.T;
                String strH2 = vw4.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.x0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = vw4.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.x0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = vw4.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentI = i(strH2, strH3 == null ? null : Uri.parse(strH3), vw4.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), vw4.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentI != null) {
                try {
                    getContext().startActivity(intentI);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentI, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i) {
        Editable text = this.L.getText();
        Cursor cursor = this.n0.y;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.n0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // defpackage.yt
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.u0 = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.w0);
        this.v0 = false;
    }

    @Override // defpackage.yt
    public final void onActionViewExpanded() {
        if (this.v0) {
            return;
        }
        this.v0 = true;
        SearchAutoComplete searchAutoComplete = this.L;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.w0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.z0);
        post(this.A0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.L;
            int[] iArr = this.a0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.b0;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.V;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.W;
            rect2.set(i7, 0, i8, i9);
            Xn1 xn1 = this.U;
            if (xn1 == null) {
                Xn1 xn2 = new Xn1(rect2, rect, searchAutoComplete);
                this.U = xn2;
                setTouchDelegate(xn2);
            } else {
                xn1.b.set(rect2);
                Rect rect3 = xn1.d;
                rect3.set(rect2);
                int i10 = -xn1.e;
                rect3.inset(i10, i10);
                xn1.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.CQf, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.m0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.s0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.s0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.s0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LPt6Fixed)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LPt6Fixed lPt6 = (LPt6Fixed) parcelable;
        super.onRestoreInstanceState(lPt6.w);
        v(lPt6.y);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LPt6Fixed lPt6 = new LPt6Fixed(super.onSaveInstanceState());
        lPt6.y = this.m0;
        return lPt6;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.z0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.L;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.x0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.L.getText());
        if (!z2 && (!this.l0 || this.v0)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.R;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.L.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.r0 || !isFocusable()) {
            return false;
        }
        if (this.m0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.L.requestFocus(i, rect);
        if (zRequestFocus) {
            v(false);
        }
        return zRequestFocus;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.l0;
        SearchAutoComplete searchAutoComplete = this.L;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.d0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public void setAppSearchData(Bundle bundle) {
        this.y0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.k0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.l0 == z) {
            return;
        }
        this.l0 = z;
        v(z);
        s();
    }

    public void setImeOptions(int i) {
        this.L.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.L.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.s0 = i;
        requestLayout();
    }

    public void setOnCloseListener(PRnFixed pRn) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.j0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(y yVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.k0 = onClickListener;
    }

    public void setOnSuggestionListener(RBi rBi) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.p0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.q0 = z;
        wc0 wc0Var = this.n0;
        if (wc0Var instanceof vw4) {
            ((vw4) wc0Var).L = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.x0 = searchableInfo;
        SearchAutoComplete searchAutoComplete = this.L;
        Intent intent = null;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.x0.getImeOptions());
            int inputType = this.x0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.x0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            wc0 wc0Var = this.n0;
            if (wc0Var != null) {
                wc0Var.b(null);
            }
            if (this.x0.getSuggestAuthority() != null) {
                vw4 vw4Var = new vw4(getContext(), this, this.x0, this.B0);
                this.n0 = vw4Var;
                searchAutoComplete.setAdapter(vw4Var);
                ((vw4) this.n0).L = this.q0 ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.x0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.x0.getVoiceSearchLaunchWebSearch()) {
                intent = this.g0;
            } else if (this.x0.getVoiceSearchLaunchRecognizer()) {
                intent = this.h0;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.t0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.m0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.o0 = z;
        v(this.m0);
    }

    public void setSuggestionsAdapter(wc0 wc0Var) {
        this.n0 = wc0Var;
        this.L.setAdapter(wc0Var);
    }

    public final void t() {
        int i = 0;
        if (!((this.o0 || this.t0) && !this.m0) || (this.Q.getVisibility() != 0 && this.S.getVisibility() != 0)) {
            i = 8;
        }
        this.O.setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0021  */
    public final void u(boolean z) {
        int i;
        boolean z2 = this.o0;
        if (z2) {
            i = 0;
            if (!((z2 || this.t0) && !this.m0) || !hasFocus() || (!z && this.t0)) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.Q.setVisibility(i);
    }

    public final void v(boolean z) {
        this.m0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.L.getText());
        this.P.setVisibility(i2);
        u(z2);
        this.M.setVisibility(z ? 8 : 0);
        ImageView imageView = this.c0;
        imageView.setVisibility((imageView.getDrawable() == null || this.l0) ? 8 : 0);
        q();
        boolean z3 = !z2;
        if (this.t0 && !this.m0 && z3) {
            this.Q.setVisibility(8);
            i = 0;
        }
        this.S.setVisibility(i);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.z0 = new CQf();
        this.A0 = new F1();
        this.B0 = new WeakHashMap<>();
        YKK ykk = new YKK();
        auxFixed auxVar = new auxFixed();
        T23 t23 = new T23();
        byN byn = new byN();
        EQ eq = new EQ();
        QnHx qnHx = new QnHx();
        int[] iArr = xApe.O;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        g85 g85Var = new g85(context, typedArrayObtainStyledAttributes);
        bi5.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(g85Var.h(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.L = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.M = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.N = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.O = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.P = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.Q = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.R = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.S = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.c0 = imageView5;
        bi5.LPt8Fixed.q(viewFindViewById, g85Var.e(10));
        bi5.LPt8Fixed.q(viewFindViewById2, g85Var.e(14));
        imageView.setImageDrawable(g85Var.e(13));
        imageView2.setImageDrawable(g85Var.e(7));
        imageView3.setImageDrawable(g85Var.e(4));
        imageView4.setImageDrawable(g85Var.e(16));
        imageView5.setImageDrawable(g85Var.e(13));
        this.d0 = g85Var.e(12);
        t85.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.e0 = g85Var.h(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f0 = g85Var.h(5, 0);
        imageView.setOnClickListener(ykk);
        imageView3.setOnClickListener(ykk);
        imageView2.setOnClickListener(ykk);
        imageView4.setOnClickListener(ykk);
        searchAutoComplete.setOnClickListener(ykk);
        searchAutoComplete.addTextChangedListener(qnHx);
        searchAutoComplete.setOnEditorActionListener(t23);
        searchAutoComplete.setOnItemClickListener(byn);
        searchAutoComplete.setOnItemSelectedListener(eq);
        searchAutoComplete.setOnKeyListener(auxVar);
        searchAutoComplete.setOnFocusChangeListener(new LPt8Fixed());
        setIconifiedByDefault(g85Var.a(8, true));
        int iD = g85Var.d(1, -1);
        if (iD != -1) {
            setMaxWidth(iD);
        }
        this.i0 = g85Var.j(6);
        this.p0 = g85Var.j(11);
        int iG = g85Var.g(3, -1);
        if (iG != -1) {
            setImeOptions(iG);
        }
        int iG2 = g85Var.g(2, -1);
        if (iG2 != -1) {
            setInputType(iG2);
        }
        setFocusable(g85Var.a(0, true));
        g85Var.m();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.g0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.h0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.T = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new NUlFixed());
        }
        v(this.l0);
        s();
    }
}
