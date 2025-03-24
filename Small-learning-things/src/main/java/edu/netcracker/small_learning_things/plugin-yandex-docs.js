(function () {
    function setRate(currId, cellId, date) {
        var xhr = new XMLHttpRequest();
        xhr.onload = function () {
            var oData = JSON.parse(xhr.response);
            var sheet = Api.GetSheet('Вклады');
            var range = sheet.GetRange(cellId);
            var rate = oData.Cur_OfficialRate;
            range.SetValue(rate.toString().replace('.', ','));
        };
        let url = 'https://api.nbrb.by/exrates/rates/' + currId;
        if (date !== '') {
            var parts = date.split('.');
            var dt = new Date(parseInt(parts[2], 10),
                parseInt(parts[1], 10) - 1,
                parseInt(parts[0], 10));
            url += '?ondate=' + dt.toISOString().split('T')[0];
        }
        xhr.open("GET", url, false);
        xhr.send();
    }

    for (let i = 5; i < 27; i++) {
        var range = Api.GetActiveSheet().GetRange('B' + i);
        if (range.GetText() === '') {
            break;
        }
        setRate(431, 'E' + i, range.GetText());
        setRate(456, 'F' + i, range.GetText());
    }

    setRate(431, 'E29', '');
    setRate(456, 'F29', '');
})();
