<#import "parts/common.ftl" as c>

<@c.page>
<a class="btn btn-primary" data-toggle="collapse" href="#multiCollapseExample1"
   role="button" aria-expanded="false" aria-controls="multiCollapseExample1">
    Add new message
</a>
<div>
    <div class="form-group my-3">
        <form method="post" class="collapse multi-collapse" id="multiCollapseExample1">
            <div class="form-group">
                <input type="text" class="form-control col-sm-6" name="text" placeholder="Введіть повідомлення" />
            </div>
            <div class="form-group">
                <input type="text" class="form-control col-sm-6" name="tag" placeholder="tag" />
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавити</button>
            </div>
        </form>
    </div>
</div>
<div class="card-group">
    <#list messages as message>
        <div class="card my-3" style="width: 18rem;">
            <div class="m-2">
                <span>${message.text}</span>
                <i>${message.tag}</i>
            </div>
            <div class="card-footer text-muted">
                <strong>${message.authorName}</strong>
            </div>
        </div>
    <#else>
No message
    </#list>
</div>
</@c.page>