package appinventor.ai_williamkenzie81.Sophie_Alerts;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0609runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0621lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit12;
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit19;
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("GoToUrl").readResolve());
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Screen1.yail", 118912);
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AboutScreen").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("IgnoreSslErrors").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("PromptforPermission").readResolve());
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("WebViewer1$PageLoaded").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("PageLoaded").readResolve());
    static final PairWithPosition Lit38;
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("WebViewer1$ErrorOccurred").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("ErrorOccurred").readResolve());
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final IntNum Lit6;
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public final ModuleMethod Screen1$Initialize;
    public WebViewer WebViewer1;
    public final ModuleMethod WebViewer1$ErrorOccurred;
    public final ModuleMethod WebViewer1$PageLoaded;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit38 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Screen1.yail", 172108);
        int[] iArr = new int[2];
        iArr[0] = -14803426;
        Lit19 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -9270823;
        Lit17 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -14803426;
        Lit12 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -9270823;
        Lit6 = IntNum.make(iArr4);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit41, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit42, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit43, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit44, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit45, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit46, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit47, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit48, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit49, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit50, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit51, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit52, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit53, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit54, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7098639402960890708.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame2, 21, Lit29, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        this.WebViewer1$PageLoaded = new ModuleMethod(frame2, 24, Lit36, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.WebViewer1$ErrorOccurred = new ModuleMethod(frame2, 25, Lit39, 12291);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Sophie Alerts is an app that is designed to alert you to pedophiles and potential pedophiles, all in one app.", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.TRUE, Lit9);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Sophie Alerts", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit7);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Sophie.png", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "fade", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit7);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit7);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "sensor", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit9);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Responsive", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "AppTheme.Light.DarkActionBar", Lit4);
                    C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "Default", Lit4);
                    Values.writeValues(C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Boolean.FALSE, Lit9), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0609runtime.addToCurrentFormEnvironment(Lit29, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit29, this.Screen1$Initialize);
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit30);
                }
                this.WebViewer1 = null;
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit31, Lit26, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit34, Lit26, lambda$Fn4);
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0609runtime.addToCurrentFormEnvironment(Lit36, this.WebViewer1$PageLoaded);
                } else {
                    addToFormEnvironment(Lit36, this.WebViewer1$PageLoaded);
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "WebViewer1", "PageLoaded");
                } else {
                    addToEvents(Lit26, Lit37);
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0609runtime.addToCurrentFormEnvironment(Lit39, this.WebViewer1$ErrorOccurred);
                } else {
                    addToFormEnvironment(Lit39, this.WebViewer1$ErrorOccurred);
                }
                if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "WebViewer1", "ErrorOccurred");
                } else {
                    addToEvents(Lit26, Lit40);
                }
                C0609runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Sophie Alerts is an app that is designed to alert you to pedophiles and potential pedophiles, all in one app.", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.TRUE, Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Sophie Alerts", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Sophie.png", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "fade", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "sensor", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Responsive", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "AppTheme.Light.DarkActionBar", Lit4);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "Default", Lit4);
        return C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Boolean.FALSE, Lit9);
    }

    public Object Screen1$Initialize() {
        C0609runtime.setThisForm();
        return C0609runtime.callComponentMethod(Lit26, Lit27, LList.list1("https://sophieproject.github.io/app/default/index.html"), Lit28);
    }

    static Object lambda4() {
        C0609runtime.setAndCoerceProperty$Ex(Lit26, Lit32, Boolean.TRUE, Lit9);
        return C0609runtime.setAndCoerceProperty$Ex(Lit26, Lit33, Boolean.FALSE, Lit9);
    }

    static Object lambda5() {
        C0609runtime.setAndCoerceProperty$Ex(Lit26, Lit32, Boolean.TRUE, Lit9);
        return C0609runtime.setAndCoerceProperty$Ex(Lit26, Lit33, Boolean.FALSE, Lit9);
    }

    public Object WebViewer1$PageLoaded(Object $url) {
        C0609runtime.sanitizeComponentData($url);
        C0609runtime.setThisForm();
        return C0609runtime.setAndCoerceProperty$Ex(Lit26, Lit35, C0609runtime.getProperty$1(Lit26, Lit35), Lit9);
    }

    public Object WebViewer1$ErrorOccurred(Object $errorCode, Object $description, Object $failingUrl) {
        C0609runtime.sanitizeComponentData($errorCode);
        C0609runtime.sanitizeComponentData($description);
        C0609runtime.sanitizeComponentData($failingUrl);
        C0609runtime.setThisForm();
        return C0609runtime.callYailPrimitive(C0609runtime.open$Mnanother$Mnscreen, LList.list1("Error"), Lit38, "open another screen");
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public Object apply3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3) {
            return moduleMethod.selector == 25 ? this.$main.WebViewer1$ErrorOccurred(obj, obj2, obj3) : super.apply3(moduleMethod, obj, obj2, obj3);
        }

        public int match3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, CallContext callContext) {
            if (moduleMethod.selector != 25) {
                return super.match3(moduleMethod, obj, obj2, obj3, callContext);
            }
            callContext.value1 = obj;
            callContext.value2 = obj2;
            callContext.value3 = obj3;
            callContext.proc = moduleMethod;
            callContext.f221pc = 3;
            return 0;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 24:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                case 24:
                    return this.$main.WebViewer1$PageLoaded(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return this.$main.Screen1$Initialize();
                case 22:
                    return Screen1.lambda4();
                case 23:
                    return Screen1.lambda5();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(false);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0621lists.cons(C0621lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0621lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0621lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0621lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0621lists.cons(componentObject, C0621lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0621lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0621lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = C0621lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0621lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0621lists.caddr.apply1(component$Mninfo);
                C0621lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0621lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0621lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0621lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0621lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0621lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0621lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0621lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0621lists.caddr.apply1(component$Mninfo3);
                C0621lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
